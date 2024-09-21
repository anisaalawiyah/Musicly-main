package org.anisa.musicly.repository;

import org.anisa.musicly.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    
}
