package com.movies.backend.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImbdResponseParser implements Serializable {
    @JsonProperty("Search")
    private List<Movie> Search;
    private String totalResults;
    private boolean Response;
}
