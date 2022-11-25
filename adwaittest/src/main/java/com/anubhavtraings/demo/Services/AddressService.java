package com.anubhavtraings.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhavtraings.demo.Entities.Address;
import com.anubhavtraings.demo.Entities.IAddressPersistance;


@Component
public class AddressService {

	@Autowired
	IAddressPersistance addressJpaObj;
	
	public List<Address> getallAddress() {
		return addressJpaObj.findAll();
		}
	
	public Address createAddress(Address payload) {
		return addressJpaObj.save(payload);
	}
	
}
