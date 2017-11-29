package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class DeviceGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "deviceGroup_id")
	private Long id;
	private String name;
	private String description;

	@ManyToMany(mappedBy = "deviceGroups")
	private Set<Device> devices = new HashSet<Device>();
	
	@ManyToMany
	@JoinTable(name = "deviceGroup_userGroup", 
			joinColumns = @JoinColumn(name = "userGroup_id", referencedColumnName = "userGroup_id", nullable = false), 
			inverseJoinColumns = @JoinColumn(name = "deviceGroup_id", referencedColumnName = "deviceGroup_id", nullable = false))
	private Set<UserGroup> userGroups = new HashSet<UserGroup>();
	
	public DeviceGroup() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Device> getDevices() {
		return devices;
	}

	public void setDevices(Set<Device> devices) {
		this.devices = devices;
	}

	public Set<UserGroup> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(Set<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}

}
