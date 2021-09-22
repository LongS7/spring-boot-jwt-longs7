package com.longs7.springbootjwtlongs7.repo;

import com.longs7.springbootjwtlongs7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
