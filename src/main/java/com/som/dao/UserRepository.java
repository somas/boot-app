package com.som.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.som.bean.User;

public interface UserRepository extends JpaRepository<User, String> {
}
