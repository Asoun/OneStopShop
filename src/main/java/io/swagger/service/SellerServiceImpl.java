package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.NotFoundException;
import io.swagger.dao.SellerRepository;
import io.swagger.model.Seller;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	@Override
	public ResponseEntity<Seller> sellersPost(Seller body) throws NotFoundException {

		Seller seller = sellerRepository.findOne(body.getSellerId());
		if (seller != null) {
			throw new NotFoundException(500, "Seller already exist with this sellerId.");
		} else {
			seller = sellerRepository.save(body);
			return new ResponseEntity<Seller>(seller, HttpStatus.ACCEPTED);
		}

	}

	@Override
	public ResponseEntity<Seller> sellersSellerNameGet(String sellerName) throws NotFoundException {
		Seller seller = sellerRepository.findBySellerName(sellerName);
		if (seller == null) {
			throw new NotFoundException(500, "No seller found with this seller name.");
		} else
			return new ResponseEntity<Seller>(seller, HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Seller> sellersSellerIdGet(Long sellerId) throws NotFoundException {
		Seller seller = sellerRepository.findOne(sellerId);
		if (seller == null) {
			throw new NotFoundException(500, "No Seller found with this sellerId.");
		} else
			return new ResponseEntity<Seller>(seller, HttpStatus.ACCEPTED);

	}
}
