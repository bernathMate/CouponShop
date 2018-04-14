package com.codecool.web.model;

import java.util.Objects;

public final class Shop extends AbstractModel {

    private final String name;
    private final int userid;

    public Shop(int id, String name, int userid) {
        super(id);
        this.name = name;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public int getUserid() {
        return userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
