// ProductRepo.java (Repository)
package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
