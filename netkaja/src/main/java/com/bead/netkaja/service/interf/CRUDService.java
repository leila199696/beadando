package com.bead.netkaja.service.interf;

import com.bead.netkaja.model.Base;

import java.util.List;

public interface CRUDService<T extends Base> {
    T create(T type);
    T delete(T type);
    T update(T type);
    List<T> list();
}
