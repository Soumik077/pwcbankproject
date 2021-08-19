package com.pwc.bank.service;

import com.pwc.bank.entity.Users;
import com.pwc.bank.exceptions.noDataException;
import com.pwc.bank.repositories.usersRepository;
import com.pwc.bank.request.usersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userServiceImpl implements userService
{
    @Autowired
    private usersRepository usersRepository;

    //@Autowired
    //private Users user;

    @Override
    public Users createUser(usersDTO usersDTO)
    {
        Users user = new Users();
        user.setFirstName(usersDTO.getFirstName());
        user.setMiddleName(usersDTO.getMiddleName());
        user.setLastName(usersDTO.getLastName());
        user.setEmailId(usersDTO.getEmailId());
        user.setDateOfBirth(usersDTO.getDateOfBirth());
        user.setOccupation(usersDTO.getOccupation());
        user.setMobileNumber(usersDTO.getMobileNumber());
        user.setCustomerId(usersDTO.getCustomerId());

        return usersRepository.save(user);
        //return user;
    }

    @Override
    public List<Users> fetchAllUsers() throws noDataException {
        List<Users> users = (List<Users>) usersRepository.findAll();
        if(users.isEmpty())
            throw new noDataException("No records found");

        return (List<Users>) usersRepository.findAll();
    }

    @Override
    public void deletebyId(Long customerId) {
        usersRepository.deleteById(customerId);
    }




    @Override
    public List<Users> getAllUsers(Integer pageNo, Integer pageSize, String sortBy) {

        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<Users> pagedResult = usersRepository.findAll(paging);

        if(pagedResult.hasContent())
            return pagedResult.getContent();
        return new ArrayList<Users>();
    }

}
