package com.anubhavtraings.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhavtraings.demo.Entities.IVendorPersistance;
import com.anubhavtraings.demo.Entities.Vendor;
@Component
public class VendorService {
	
	@Autowired
	IVendorPersistance vendorJPAObj;
	@Autowired
	Vendor Vendor;
	
	public  List<Vendor> getAllVendors() {
		return vendorJPAObj.findAll()	;
		}
	
	public Optional<Vendor> getSingleVendor(String Id) {
		return vendorJPAObj.findById(Id);
	}
	
	public Vendor createVendor(Vendor payload) {
		return vendorJPAObj.save(payload);
	}
	
	public Vendor updateVendor(Vendor payload) {
		return vendorJPAObj.save(payload);
	}
	
	public String deleteVendor(String Id) {
		 vendorJPAObj.deleteById(Id);
		 return "Deleted";
	}
	
	
}
