package com.commerce.infinitymart.core.domain.cart;

import com.commerce.infinitymart.core.domain.product.Product;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartProduct {
  private Product product;
  private Integer quantity;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartProduct that = (CartProduct) o;
    return Objects.equals(product, that.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product);
  }
}
