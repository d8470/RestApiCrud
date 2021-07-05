package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {

}
