package com.example.demo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	private String serialNumber;
	private String name;
	private String Status;
	private String firmware;
	private String imei;
	private Long externalId;
	private boolean isActive;
	private Date createdOn;
	private User createdByUser;

	@OneToMany(mappedBy = "device")
	@Column(nullable = false)
	private Set<DeviceNote> deviceNotes = new HashSet<DeviceNote>();

	@OneToMany(mappedBy = "device")
	@Column(nullable = false)
	private Set<DeviceMetadata> deviceMetadata = new HashSet<DeviceMetadata>();

	@OneToOne(mappedBy = "device")
	@Column(nullable = false)
	private DeviceConfiguration deviceConfiguration;

	@ManyToMany
	@JoinTable(name = "device_deviceGroup", 
			joinColumns = @JoinColumn(name = "deviceGroup_id", referencedColumnName = "deviceGroup_id", nullable = false), 
			inverseJoinColumns = @JoinColumn(name = "device_id", referencedColumnName = "device_id", nullable = false))
	private Set<DeviceGroup> deviceGroups = new HashSet<DeviceGroup>();

	public Device() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getFirmware() {
		return firmware;
	}

	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Long getExternalId() {
		return externalId;
	}

	public void setExternalId(Long externalId) {
		this.externalId = externalId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public User getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(User createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Set<DeviceNote> getDeviceNotes() {
		return deviceNotes;
	}

	public void setDeviceNotes(Set<DeviceNote> deviceNotes) {
		this.deviceNotes = deviceNotes;
	}

	public Set<DeviceMetadata> getDeviceMetadata() {
		return deviceMetadata;
	}

	public void setDeviceMetadata(Set<DeviceMetadata> deviceMetadata) {
		this.deviceMetadata = deviceMetadata;
	}

	public DeviceConfiguration getDeviceConfiguration() {
		return deviceConfiguration;
	}

	public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
		this.deviceConfiguration = deviceConfiguration;
	}

	public Set<DeviceGroup> getDeviceGroups() {
		return deviceGroups;
	}

	public void setDeviceGroups(Set<DeviceGroup> deviceGroups) {
		this.deviceGroups = deviceGroups;
	}

	
}
