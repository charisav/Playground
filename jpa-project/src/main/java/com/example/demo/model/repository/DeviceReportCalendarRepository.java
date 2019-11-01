package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DeviceConfiguration;
import com.example.demo.model.DeviceReportCalendar;

public interface DeviceReportCalendarRepository extends JpaRepository<DeviceReportCalendar, Long> {
	DeviceReportCalendar findByDeviceConfiguration(DeviceConfiguration deviceConfiguration);
}
