package com.example.demo.db.entity;

import java.io.Serializable;

public interface BaseEntity <T extends Serializable> {
    T getId();

    void setId();
}
