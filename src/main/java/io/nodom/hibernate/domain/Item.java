package io.nodom.hibernate.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@RequiredArgsConstructor
public class Item extends BaseEntity<Long> implements Serializable {

  private String name;
  private BigDecimal initialPrice;
  private LocalDate auctionDate;
  private boolean verified;
  private AuctionType auctionType;
  private LocalDate auctionStart;
  private LocalDate auctionEnd;
  private Set<Bid> bids = new HashSet<>();


  /**
   * you should always provide this kind of grouping operations,
   *
   * @param bid
   */
  public void addBid(Bid bid) {
    if (bid == null) {
      throw new IllegalArgumentException("the Bid Cannot be NULL");
    }
    if (bid.getItem() != null) {
      throw new IllegalStateException("Bid is Already assigned to an Item");
    }
    this.bids.add(bid);
    bid.setItem(this);
  }
}
