package com.emusicstore.dao.impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hanghua on 4/22/17.
 */
@Repository
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listOfCarts;

    public CartDaoImpl(){
        listOfCarts = new HashMap<String, Cart>();
    }

    public Cart create(Cart cart){
        if(listOfCarts.keySet().contains(cart.getCartId())){
            throw new IllegalArgumentException(String.format("Cannot create a cart, a cart with this given id(%)" + " already " + " exists", cart.getCartId()));
        }

        listOfCarts.put(String.valueOf((cart.getCartId())),cart);

        return cart;
    }

    public Cart read(String cartId){
        return listOfCarts.get(cartId);
    }

    public void update(String cartId, Cart cart){
        if(!listOfCarts.keySet().contains(cartId)){
            throw new IllegalArgumentException(String.format("Cannot update this cart, a cart with this given id(%)" + " doesn't " + " exist", cartId));

        }

        listOfCarts.put(cartId,cart);
    }

    public void delete(String cartId){
        if(!listOfCarts.keySet().contains(cartId)){
            throw new IllegalArgumentException(String.format("Cannot delete this cart, a cart with this given id(%)" + " doesn't " + " exist", cartId));
        }

        listOfCarts.remove(cartId);
    }
}