package com.commerce.infinitymart.infrastructure.dto.response.cart;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartResponse {
  private String buyerId;
  private Set<CartProductResponse> cartProducts;
}
