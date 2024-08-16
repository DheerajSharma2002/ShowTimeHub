package com.ravi.ShowTimeHub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Movie {

    private String movieId;

    private String title;

    private String genre;

    private String director;

    private List<String> actors;

    private DateFormat releasedDate;

    private List<Review> reviews;
}
