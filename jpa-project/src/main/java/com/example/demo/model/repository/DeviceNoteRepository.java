package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Device;
import com.example.demo.model.DeviceNote;

public interface DeviceNoteRepository extends JpaRepository<DeviceNote, Long> {
	DeviceNote findByDevice(Device device);
}
