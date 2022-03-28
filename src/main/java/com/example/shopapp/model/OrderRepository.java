package com.example.shopapp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface OrderRepository extends JpaRepository<Order, Integer> {

}
