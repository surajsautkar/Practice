package com.example.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Practice;
@Repository
public interface PracticeRepository extends JpaRepository<Practice, Serializable>, CrudRepository<Practice, Serializable> {

}
