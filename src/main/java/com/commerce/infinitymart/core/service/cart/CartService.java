package com.commerce.infinitymart.core.service.cart;

import com.commerce.infinitymart.core.domain.cart.Cart;
import com.commerce.infinitymart.infrastructure.dto.request.CartRequest;

/**
 * Cart Service is responsible for managing tCartServicehe cart.
 * addProductToCart method is used to add a product to the cart and the quantity of the product.
 */
public interface CartService {
  Cart addProductToCart(CartRequest request);

  Cart removeProductFromCart(CartRequest request);
}
