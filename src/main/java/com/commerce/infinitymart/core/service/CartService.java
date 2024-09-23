package com.commerce.infinitymart.core.service;

import com.commerce.infinitymart.core.domain.cart.Cart;
public interface CartService {
  Cart addProductToCart(Long productId);
}
