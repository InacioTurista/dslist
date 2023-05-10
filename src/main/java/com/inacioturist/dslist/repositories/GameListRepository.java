package com.inacioturist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioturist.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
