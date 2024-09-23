package com.commerce.infinitymart.core.service;

import com.commerce.infinitymart.core.domain.cart.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService {
  @Override
  public Cart addProductToCart(Long productId) {
    return Cart.builder().id(productId).build();
  }
}
