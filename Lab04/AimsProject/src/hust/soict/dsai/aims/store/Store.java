package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	
//	private int storeQty = 0;
	private ArrayList<Media> itemsInStore;
	public Store() {
		super();
		this.itemsInStore = new ArrayList<Media>(); 
	}
	
	public void print() {
		for (Media media : itemsInStore) {
			System.out.println(media.toString());
		 }
	}
	
	public void addMedia(Media media) {

		if (itemsInStore.contains(media)) {
			System.out.println("Media already exists");
		}
		else {
			itemsInStore.add(media);
			System.out.println("Added");
			}
	}
	
	public void removeMedia(Media media) {
		if(itemsInStore.contains(media)) {
    		itemsInStore.remove(media);
    		System.out.println("Removed");
    	}
    	else {
    		System.out.println("Media does not exist");
    	}
	}
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	
	
	/*
	public void print() {
		for (DigitalVideoDisc disc : itemsInStore) {
			 if (disc == null) {
				 break;
			 }
			 else {
				 System.out.println(disc.getId() + ". " + disc.toString());
			 }		 
		 }
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (storeQty < itemsInStore.length) {
			itemsInStore[storeQty] = disc;
			storeQty++;
			System.out.println("Added");
		} 
		else {System.out.println("Full");}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < storeQty; i++) {
			if (itemsInStore[i].equals(disc)) {
				itemsInStore[i] = itemsInStore[storeQty - 1];
				itemsInStore[storeQty - 1] = null;
				storeQty -= 1;
				i--;
				found = true;
			}
		}
		if (found == true) {
			System.out.println("Removed");
		}
		else {System.out.println("Not found");}
	}
	*/
}
	