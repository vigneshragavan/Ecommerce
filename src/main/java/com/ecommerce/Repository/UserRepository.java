package com.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.User;

public interface  UserRepository extends JpaRepository<User,Long>{

}