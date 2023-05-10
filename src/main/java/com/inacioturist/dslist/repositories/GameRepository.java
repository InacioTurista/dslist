package com.inacioturist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioturist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
