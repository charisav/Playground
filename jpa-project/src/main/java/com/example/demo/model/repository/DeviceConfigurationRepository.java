package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Device;
import com.example.demo.model.DeviceConfiguration;

public interface DeviceConfigurationRepository extends JpaRepository<DeviceConfiguration, Long> {
	DeviceConfiguration findByDevice(Device device);
}
