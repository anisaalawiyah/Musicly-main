package org.anisa.musicly.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Genre {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String genre;   
}