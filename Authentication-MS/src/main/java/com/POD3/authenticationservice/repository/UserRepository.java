package com.POD3.authenticationservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POD3.authenticationservice.model.AppUser;


@Repository
public interface UserRepository extends JpaRepository<AppUser, String> {

}