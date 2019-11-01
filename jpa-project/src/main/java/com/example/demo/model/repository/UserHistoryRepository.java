package com.example.demo.model.repository;

import com.example.demo.model.User;
import com.example.demo.model.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {

    UserHistory findByUser(User user);
}
