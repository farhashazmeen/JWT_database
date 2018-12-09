package com.example.controller;


import com.example.models.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//<---  Rest endpoints that to interact with the database --->
@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    public UserRepository repository;
    //<---  GET request to get all documents from the User collection. --->
    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public List<User> getAllUsers() {
       return repository.findAll();
    }
    //<---  GET requests followed by an Id and maps to the getUserById() method, which searches the User
    // collection for the document with an _id field equal to the Id in the URL. --->
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUsersById(@PathVariable("id") Integer id) {
        return repository.findBy_id(id);
    }
    //<---  PUT request to modify a document in the collection --->
   // @PutMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void modifyUserById(@RequestBody User user) {
        //pets.set_id(id);
        repository.save(user);
    }
    //<--- Insert a new object/document in the collection --->
    @PostMapping
    public String createUser(@RequestBody User user) {
        //pets.set_id( id);
        repository.save(user);
        return "User Created Successfully";
    }
    //<--- This end point takes an id of document User and delete it --->
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id)
    {
        repository.delete(repository.findBy_id(id));
        return "User Deleted Successfully";
    }
}