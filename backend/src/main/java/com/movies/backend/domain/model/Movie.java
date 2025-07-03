package com.movies.backend.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
    @Id
    @Column(name = "uuid", nullable = false)
    private String imdbID;

    @JsonProperty("Title")
    @Column(name = "title", nullable = true)
    private String Title;

    @JsonProperty("Year")
    @Column(name = "year", nullable = true)
    private String Year;

    @JsonProperty("Plot")
    @Column(name = "plot", nullable = true)
    private String Plot;
}
