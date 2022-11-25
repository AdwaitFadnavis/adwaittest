package com.anubhavtraings.demo.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressPersistance extends JpaRepository<Address, String> {

}
