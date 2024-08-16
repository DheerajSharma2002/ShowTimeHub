package com.ravi.ShowTimeHub.Repository;

import com.ravi.ShowTimeHub.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
}
