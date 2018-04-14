package com.codecool.web.service;

import com.codecool.web.model.Coupon;
import com.codecool.web.model.Shop;
import com.codecool.web.service.exception.ServiceException;

import java.sql.SQLException;
import java.util.List;

public interface ShopService {

    List<Shop> getShops() throws SQLException;

    Shop getShop(String id) throws SQLException, ServiceException;

    Shop addShop(String name, int userId) throws SQLException, ServiceException;
}
