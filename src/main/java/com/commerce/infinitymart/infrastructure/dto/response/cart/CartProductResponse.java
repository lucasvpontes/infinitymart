package com.commerce.infinitymart.infrastructure.dto.response.cart;

import com.commerce.infinitymart.core.domain.product.Product;
import com.commerce.infinitymart.infrastructure.dto.response.product.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartProductResponse {
  private ProductResponse product;
  private Integer quantity;
  }
