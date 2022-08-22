package com.mb.ticketingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.ticketingsystem.entity.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Long> {

}
