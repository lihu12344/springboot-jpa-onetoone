package com.example.demo.dao;

import com.example.demo.pojo.PersonMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonMapRepository extends JpaRepository<PersonMap,Integer> {
}