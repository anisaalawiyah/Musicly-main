package org.anisa.musicly.repository;

import org.anisa.musicly.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    
}
