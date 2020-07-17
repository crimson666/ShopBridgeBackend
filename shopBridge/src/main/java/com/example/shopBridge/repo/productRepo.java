package com.example.shopBridge.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.shopBridge.entity.products;

@RepositoryRestResource(collectionResourceRel="products",path="products")
public interface productRepo extends JpaRepository<products,Integer>{

}
