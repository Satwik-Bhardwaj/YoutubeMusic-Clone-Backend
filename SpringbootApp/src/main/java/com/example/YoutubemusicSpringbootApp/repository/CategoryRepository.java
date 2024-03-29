package com.example.YoutubemusicSpringbootApp.repository;

import com.example.YoutubemusicSpringbootApp.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {
}
