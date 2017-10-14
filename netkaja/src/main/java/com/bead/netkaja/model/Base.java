package com.bead.netkaja.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long ID;
    @Version
    @Column(name = "VERSION")
    public Integer version;

    public Base() {
    }
}
