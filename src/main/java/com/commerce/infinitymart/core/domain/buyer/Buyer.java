package com.commerce.infinitymart.core.domain.buyer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Buyer {
  private String id;
  private String name;
  private String identificationDocument;
}
