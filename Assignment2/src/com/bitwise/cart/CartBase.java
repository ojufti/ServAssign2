package com.bitwise.cart;

import java.util.HashMap;
import java.util.Map;

public class CartBase {
	Map user= new HashMap();
void addData(String item,String quant)
{
	String i=item,q=quant;
	user.put(i, q);
	
}
Map viewData()
{
	return user;
}
}
