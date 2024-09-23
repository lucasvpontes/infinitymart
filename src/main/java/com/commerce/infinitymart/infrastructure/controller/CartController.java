package com.commerce.infinitymart.infrastructure.controller;

import com.commerce.infinitymart.core.domain.cart.Cart;
import com.commerce.infinitymart.core.service.cart.CartService;
import com.commerce.infinitymart.infrastructure.dto.request.CartRequest;
import com.commerce.infinitymart.infrastructure.dto.response.cart.CartProductResponse;
import com.commerce.infinitymart.infrastructure.dto.response.cart.CartResponse;
import com.commerce.infinitymart.infrastructure.dto.response.product.ProductResponse;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/cart", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {

  private final CartService cartService;

  @PostMapping("/add")
  public ResponseEntity<CartResponse> addProductToCart(@RequestBody final CartRequest request) {
    final var cart = cartService.addProductToCart(request);
    final var cartResponse = toResponse(cart);
    return ResponseEntity.ok().body(cartResponse);
  }

  @DeleteMapping("/remove")
  public ResponseEntity<CartResponse> removeProductFromCart(@RequestBody final CartRequest request) {
    final var cart = cartService.removeProductFromCart(request);
    final var cartResponse = toResponse(cart);
    return ResponseEntity.ok().body(cartResponse);
  }

  private static CartResponse toResponse(Cart cart) {
    return CartResponse.builder()
        .cartProducts(Optional.ofNullable(cart.getCartProducts())
            .orElse(Collections.emptySet())
            .stream()
            .map(cartProduct -> CartProductResponse.builder()
                .product(ProductResponse.builder().id(cartProduct.getProduct().getId()).build())
                .quantity(cartProduct.getQuantity())
                .build()).collect(Collectors.toSet()))
        .buyerId(cart.getBuyer().getId())
        .build();
  }
}
