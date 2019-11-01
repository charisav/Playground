package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DeviceGroup;

public interface DeviceGroupRepository extends JpaRepository<DeviceGroup, Long> {
	DeviceGroup findByName(String name);
}
