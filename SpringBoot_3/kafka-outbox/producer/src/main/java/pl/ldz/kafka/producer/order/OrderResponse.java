package pl.ldz.kafka.producer.order;

import java.time.Instant;
import java.util.UUID;

public record OrderResponse(
    UUID id,
    String itemName,
    int quantity,
    Instant createdAt
) {
  public static OrderResponse from(Order order) {
    return new OrderResponse(
        order.getId(),
        order.getItemName(),
        order.getQuantity(),
        order.getCreatedAt()
    );
  }
}
