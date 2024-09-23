package com.commerce.infinitymart.core.service.cart;

import com.commerce.infinitymart.core.domain.buyer.Buyer;
import com.commerce.infinitymart.core.domain.cart.Cart;
import com.commerce.infinitymart.core.domain.cart.CartProduct;
import com.commerce.infinitymart.core.domain.product.Product;
import com.commerce.infinitymart.infrastructure.dto.request.CartRequest;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService {
  @Override
  public Cart addProductToCart(CartRequest request) {
    return Cart.builder()
        .cartProducts(
            Set.of(
                CartProduct.builder()
                    .product(Product.builder().id(request.productId()).build())
                    .quantity(request.quantity())
                    .build()))
        .buyer(Buyer.builder().id(request.buyerId()).build())
        .build();
  }

  @Override
  public Cart removeProductFromCart(CartRequest request) {
    return Cart.builder().buyer(Buyer.builder().id(request.buyerId()).build()).build();
  }
}
