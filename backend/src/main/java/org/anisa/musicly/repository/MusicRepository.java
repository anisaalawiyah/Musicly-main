package org.anisa.musicly.repository;

import java.util.List;

import org.anisa.musicly.models.Genre;
import org.anisa.musicly.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long>{
    List<Music> findMusicByGenre(Genre genre);
} 
