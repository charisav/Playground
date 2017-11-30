package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Device;
import com.example.demo.model.DeviceMetadata;

public interface DeviceMetadataRepository extends JpaRepository<DeviceMetadata, Long> {
	DeviceMetadata findByDevice(Device device);
}
