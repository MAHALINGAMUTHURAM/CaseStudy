package com.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity,Long> {

}