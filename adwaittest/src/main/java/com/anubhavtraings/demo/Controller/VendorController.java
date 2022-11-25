package com.anubhavtraings.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anubhavtraings.demo.Entities.Vendor;
import com.anubhavtraings.demo.Services.VendorService;

@RestController
@Component
public class VendorController {
	
	@Autowired
	VendorService serviceObj;
	
	@GetMapping("/vendors")
	public  List<Vendor> getAllVendors() {
		return serviceObj.getAllVendors();
		}
	
	@RequestMapping("/vendor/{vendorId}")
	public  Optional<Vendor> getSingleVendor(@PathVariable("vendorId") String vendorId) {
		return serviceObj.getSingleVendor(vendorId);
	}
	
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor myVendorData) {
		return serviceObj.createVendor(myVendorData);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/vendor")
	public Vendor updateVendor(@RequestBody Vendor myUpdateVendor) {
		return serviceObj.updateVendor(myUpdateVendor);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/vendor/{vendorId}")
	public String deleteVendor(@PathVariable("vendorId") String vendorId) {
		return serviceObj.deleteVendor(vendorId);
	}
}
