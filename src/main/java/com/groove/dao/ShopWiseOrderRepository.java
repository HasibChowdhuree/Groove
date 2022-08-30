package com.groove.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groove.entities.Order;
import com.groove.entities.ShopWiseOrder;

public interface ShopWiseOrderRepository extends JpaRepository<ShopWiseOrder, Integer> {
    @Override
    List<ShopWiseOrder> findAll();
    @Override
    ShopWiseOrder getReferenceById(Integer id);
    @Override
    void deleteById(Integer id);
    @Override
    void deleteAllByIdInBatch(Iterable<Integer> ids);
}
