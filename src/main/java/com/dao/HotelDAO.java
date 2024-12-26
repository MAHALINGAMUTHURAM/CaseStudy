package com.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Hotel;

@Repository
public interface HotelDAO extends JpaRepository<Hotel, Long> {
	
    //@Query("SELECT r FROM Hotel r WHERE r.location = :location")
    List<Hotel> findByLocation(String location);
    
    List<Hotel> findByArea_AreaId(long id);
    
}