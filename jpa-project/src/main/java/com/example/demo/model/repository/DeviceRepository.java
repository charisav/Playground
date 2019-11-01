package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
	Device findByName(String name);
}
