package com.tnsif.Shopingmall;

public class ShoppingmallDemo {

	public static void main(String[] args) {
		shopping s;
		s= new clothes();
		s.purchase();
		
		s= new Electronics();
		s.purchase();
	}
}