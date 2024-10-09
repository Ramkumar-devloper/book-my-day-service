package com.bmd.bookMyDay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmd.bookMyDay.Dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}