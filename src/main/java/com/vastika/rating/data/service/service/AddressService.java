package com.vastika.rating.data.service.service;

import com.vastika.rating.data.service.model.Address;

public interface AddressService {
	
	void saveAddress(Address address);
	void updateAddress (Address address);
	void deleteAddress(long id);
	
	
	

}
