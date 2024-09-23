package com.commerce.infinitymart.infrastructure.controller;

import com.commerce.infinitymart.core.domain.cart.Cart;
import com.commerce.infinitymart.core.service.CartService;
import com.commerce.infinitymart.infrastructure.controller.response.CartResponse;
import com.commerce.infinitymart.infrastructure.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/cart", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {

  private final CartService cartService;

  @GetMapping("/add/{productId}")
  public ResponseEntity<CartResponse> addProductToCart(@PathVariable final Long productId) {
    final var cart = cartService.addProductToCart(productId);
    final var cartResponse = toResponse(cart);
    return ResponseEntity.ok().body(cartResponse);
  }

  private static CartResponse toResponse(Cart cart) {
    return MapperUtils.map(cart, CartResponse.class);
  }
}
