package com.bead.netkaja.service.interf;

import java.util.List;

public interface CRUDService<T> {
    T create(T type);
    T delete(T type);
    T update(T type);
    List<T> list();
}
