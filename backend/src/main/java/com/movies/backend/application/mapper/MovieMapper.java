package com.movies.backend.application.mapper;

import com.movies.backend.domain.dto.MovieDTO;
import com.movies.backend.domain.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    public MovieDTO toDto(Movie movie) {
        return new MovieDTO(movie.getImdbID(), movie.getTitle(), movie.getYear(), movie.getPlot());
    }
}
