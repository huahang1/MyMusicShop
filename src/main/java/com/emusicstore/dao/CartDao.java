package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by hanghua on 4/22/17.
 */
public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
