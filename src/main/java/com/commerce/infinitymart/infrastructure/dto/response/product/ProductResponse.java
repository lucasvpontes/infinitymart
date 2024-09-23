package com.commerce.infinitymart.infrastructure.dto.response.product;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductResponse {
  private String id;
  private String name;
  private String description;
  private BigDecimal price;
  private String sellerId;
}
