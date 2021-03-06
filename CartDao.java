package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.CartEmptyException.*;
import com.cognizant.truyum.model.*;
public interface CartDao {
	public void addCartItem(long userId,long menuItemId) throws ParseException; 
	public List<MenuItem> getAllCartItems( long userId) throws CartEmptyException; 
	public  void removeCartItem(long userId,long menuItemId);

}
