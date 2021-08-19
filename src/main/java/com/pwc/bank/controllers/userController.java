package com.pwc.bank.controllers;

import com.pwc.bank.request.usersDTO;
import com.pwc.bank.response.userResponse;
import com.pwc.bank.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController
{
   @Autowired
   private userService userService;
    //userResponse userResponse;

    //creating a new user
    @PostMapping("/create")
    public ResponseEntity<userResponse> createUser(@RequestBody usersDTO usersDTO)
    {
        userResponse userResponse = new userResponse();
        userService.createUser(usersDTO);
        //userResponse.setMessage("successfully created user");
        return new ResponseEntity<userResponse>(userResponse , new HttpHeaders() , HttpStatus.OK);
    }

    //deleting a user
    @DeleteMapping("/delete/{id}")
    public String deletebyId(@PathVariable("id") Long customerId)
    {
        userService.deletebyId(customerId);
        return "user deleted successfully";
    }



    /***** Pagination and Sorting ****/
    @GetMapping
    public ResponseEntity<List<userResponse>> getAllUsers(@RequestParam(defaultValue = "0") Integer pageNo,
                                                          @RequestParam(defaultValue = "10") Integer pageSize,
                                                          @RequestParam(defaultValue = "id") String sortBy)
    {
        userResponse userResponse = new userResponse();
        userService.getAllUsers(pageNo , pageSize , sortBy);

        return new ResponseEntity<List<userResponse>>((List<com.pwc.bank.response.userResponse>) userResponse, new HttpHeaders(), HttpStatus.OK);
    }
}
