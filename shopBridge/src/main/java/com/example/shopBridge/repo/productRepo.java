package com.example.shopBridge.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.shopBridge.entity.products;

@RepositoryRestResource(collectionResourceRel="products",path="products")
@CrossOrigin(origins = "http://localhost:4200")
public interface productRepo extends JpaRepository<products,Integer>{

}
