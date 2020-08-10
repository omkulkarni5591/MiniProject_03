package com.oksoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oksoft.entities.StateMasterEntity;

public interface StateMasterRepository extends JpaRepository<StateMasterEntity, Serializable> {

}
