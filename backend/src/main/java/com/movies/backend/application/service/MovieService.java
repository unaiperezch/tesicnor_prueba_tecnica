package com.movies.backend.application.service;

import com.movies.backend.application.mapper.MovieMapper;
import com.movies.backend.domain.dto.MovieDTO;
import com.movies.backend.domain.model.ImbdResponseParser;
import com.movies.backend.domain.model.Movie;
import com.movies.backend.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private MovieRepository movieRepository;
    private MovieMapper movieMapper;

    private final String API_KEY =  "731e41f";
    private final String API_URL =  "https://www.omdbapi.com/?apikey=" + API_KEY + "&s=Star+wars";

    public MovieService(MovieRepository movieRepository,  MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    public void saveMoviesFromOmbd() {
        RestTemplate restTemplate = new RestTemplate();

        ImbdResponseParser response =
                restTemplate.getForObject(
                        API_URL,
                        ImbdResponseParser.class);

        assert response != null;

        List<Movie> movies = response.getSearch();

        assert movies != null;

        for (Movie movie : movies) {
            this.movieRepository.save(movie);
        }

    }

    public List<MovieDTO> getAll() {
        return this.movieRepository.findAll().stream().map(movie ->  this.movieMapper.toDto(movie)).collect(Collectors.toList());
    }
}
