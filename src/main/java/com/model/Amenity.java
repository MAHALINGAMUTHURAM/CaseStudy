package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Amenity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long amenityId;

	 @Column(unique = true, nullable = false)
    private String name;
	 @Column( nullable = false)
    private String description;

	public long getAmenityId() {
		return amenityId;
	}

	public void setAmenityId(long amenityId) {
		this.amenityId = amenityId;
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
    
}