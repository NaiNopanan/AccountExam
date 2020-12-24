package com.nopanan.registrationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nopanan.registrationservice.model.db.UserTb;

@Repository
public interface UserRepo extends JpaRepository<UserTb, Integer>{

}
