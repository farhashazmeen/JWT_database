package com.example.repositories;

import com.example.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

//<--- Mongodb collection which will be used for querying --->
public interface UserRepository extends MongoRepository<User,Integer> {
    User findBy_id(Integer _id);
    //User findBy(ObjectId id);
}
