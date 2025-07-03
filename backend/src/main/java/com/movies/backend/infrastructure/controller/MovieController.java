package com.movies.backend.infrastructure.controller;

import com.movies.backend.application.service.MovieService;
import com.movies.backend.domain.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping()
    public List<MovieDTO> getAll() {
        this.movieService.saveMoviesFromOmbd();

        return this.movieService.getAll();
    }
}
