package com.pwc.bank.service;

import com.pwc.bank.entity.Address;
import com.pwc.bank.repositories.addressRepository;
import com.pwc.bank.request.addressDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class addressServiceImpl implements addressService
{
    @Autowired
    addressRepository addressRepository;

    @Override
    public void enterAddress(addressDTO addressDTO)
    {
        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setCity(addressDTO.getCity());
        address.setCountry(addressDTO.getCountry());
        address.setLine(addressDTO.getLine());
        address.setPincode(addressDTO.getPincode());
        address.setState(addressDTO.getState());

        addressRepository.save(address);
    }
}
