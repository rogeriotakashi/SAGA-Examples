package com.rogerio.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerio.ProductService.models.Product;
import com.rogerio.ProductService.models.ProductDTO;
import com.rogerio.ProductService.repositories.ProductRepository;

@Service
public class ProductsService {

	@Autowired
	ProductRepository productRepository;
	
	
	public double calculateTotal(List<ProductDTO> productsOrdered) {
		double total = productsOrdered.stream()
		.map( product -> {
			Optional<Product> productEntity = productRepository.findById(product.getId());
			return productEntity.get().getPrice() * product.getQuantity();
		})
		.reduce( 0.0 , Double::sum);

		return total;
	}
	
}
