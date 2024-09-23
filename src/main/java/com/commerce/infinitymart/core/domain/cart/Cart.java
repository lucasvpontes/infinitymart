package com.commerce.infinitymart.core.domain.cart;


import com.commerce.infinitymart.core.domain.buyer.Buyer;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Cart {
  private Buyer buyer;
  private Set<CartProduct> cartProducts;
}
