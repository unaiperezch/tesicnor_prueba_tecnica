package com.movies.backend.domain.dto;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Access(AccessType.PROPERTY)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
    private String uuid;
    private String title;
    private String year;
    private String plot;
}