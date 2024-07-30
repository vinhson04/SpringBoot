package com.example.menusecurity.dao;

import com.example.menusecurity.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> findAllByOrderByName();
}