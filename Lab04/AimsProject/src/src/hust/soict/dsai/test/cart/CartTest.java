package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		Cart cart= new Cart();
		
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion king", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2= new DigitalVideoDisc("Star wars", "Science fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        
        cart.toPrint();
	}
		
}
