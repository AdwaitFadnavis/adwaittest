package com.anubhavtraings.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anubhavtraings.demo.Entities.Address;
import com.anubhavtraings.demo.Services.AddressService;
@Component
@RestController
public class AddressController {
	@Autowired
	AddressService serviceObj;
	@Autowired
	Address addressObj;

	@RequestMapping("/address")
	public  List<Address> getAlladdresses() {
		return serviceObj.getallAddress();
	}
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address payload) {
		return serviceObj.createAddress(payload);
	}
}
