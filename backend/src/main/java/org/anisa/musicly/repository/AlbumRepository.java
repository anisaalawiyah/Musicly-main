package org.anisa.musicly.repository;

import org.anisa.musicly.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long>{
    
}
