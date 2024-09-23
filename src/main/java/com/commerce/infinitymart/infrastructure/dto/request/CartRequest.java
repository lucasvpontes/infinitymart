package com.commerce.infinitymart.infrastructure.dto.request;

import lombok.Builder;

@Builder
public record CartRequest(String productId, Integer quantity, String buyerId) {}
