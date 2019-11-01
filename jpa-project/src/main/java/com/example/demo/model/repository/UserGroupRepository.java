package com.example.demo.model.repository;

import com.example.demo.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {

    UserGroup findByName(String name);
}
