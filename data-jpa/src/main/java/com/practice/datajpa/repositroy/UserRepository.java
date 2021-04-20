package com.practice.datajpa.repositroy;

import com.practice.datajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
