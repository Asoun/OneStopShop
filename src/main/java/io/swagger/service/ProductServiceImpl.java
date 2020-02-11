package io.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.NotFoundException;
import io.swagger.dao.ProductRepository;
import io.swagger.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public ResponseEntity<List<Product>> productsGet(Integer bodyLimit, Integer pageLimit) throws NotFoundException {
		List<Product> products = productRepository.findAll();
		if (products == null) {
			throw new NotFoundException(500, "No product found with this product name.");
		} else
			return new ResponseEntity<List<Product>>(products, HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Product> productsPost(Product body) throws NotFoundException {
		Product product = productRepository.findOne(body.getProductId());
		if (product != null) {
			throw new NotFoundException(500, "Product already exist with this productId.");
		} else {
			product = productRepository.save(body);
			return new ResponseEntity<Product>(product, HttpStatus.ACCEPTED);
		}
	}

	@Override
	public ResponseEntity<Product> productsProductIdGet(Integer productId) throws NotFoundException {
		Product product = productRepository.findOne(productId);
		if (product == null) {
			throw new NotFoundException(500, "No product found with this productId.");
		} else
			return new ResponseEntity<Product>(product, HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<List<Product>> productsProductNameGet(String productName) throws NotFoundException {
		List<Product> products = productRepository.findByProductName(productName);
		if (products.isEmpty()) {
			throw new NotFoundException(500, "No product found with this product name.");
		} else
			return new ResponseEntity<List<Product>>(products, HttpStatus.ACCEPTED);
	}
}
