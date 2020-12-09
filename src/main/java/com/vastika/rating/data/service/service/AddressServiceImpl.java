package com.vastika.rating.data.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.model.Address;
import com.vastika.rating.data.service.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepostory;
	
		
	@Override
	public void saveAddress(Address address) {
		addressRepostory.save(address);
		
	}

	@Override
	public void updateAddress(Address address) {
		addressRepostory.save(address);
		
	}

	@Override
	public void deleteAddress(long id) {
		//addressRepostory.deleteById(id);
		
	}

}
