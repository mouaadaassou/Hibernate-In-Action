package io.nodom.hibernate.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@RequiredArgsConstructor
public class User extends BaseEntity<Long> implements Serializable {

  @NotNull
  private String username;
  private String firstName;
  private String lastName;
}
