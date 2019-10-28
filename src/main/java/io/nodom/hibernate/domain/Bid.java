package io.nodom.hibernate.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@RequiredArgsConstructor
public class Bid extends BaseEntity<Long> implements Serializable {

  private Item item;
  private BigDecimal amount;
}
