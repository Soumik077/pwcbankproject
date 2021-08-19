package com.pwc.bank.service;

import com.pwc.bank.entity.Users;
import com.pwc.bank.exceptions.noDataException;
import com.pwc.bank.request.usersDTO;

import java.util.List;

public interface userService
{
    public Users createUser(usersDTO usersDTO);

    List<Users> fetchAllUsers() throws noDataException;

    public void deletebyId(Long customerId);

    public List<Users> getAllUsers(Integer pageNo, Integer pageSize, String sortBy);
}
