package com.bead.netkaja.model;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class Base {
      @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Version
    private int version;
}
