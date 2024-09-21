package org.anisa.musicly.repository;

import org.anisa.musicly.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
   boolean existsByEmail(String email);
   User findByEmail(String email);
} 
