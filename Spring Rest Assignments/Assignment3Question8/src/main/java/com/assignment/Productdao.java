package com.assignment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Productdao extends MongoRepository<Product, Integer> {

}