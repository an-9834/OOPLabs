package hust.soict.dsai.aims.cart;


import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int  MAX_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    /*
     * private DigitalVideoDisc[] itemsOrdered= new DigitalVideoDisc[MAX_ORDERED];
     * private int qtyOrdered = 0;
     */
    
    
    
    public void addMedia(Media media) {
    	if(itemsOrdered.size() >= MAX_ORDERED) {
    		System.out.println("Full.");
    	}
    	else if (itemsOrdered.contains(media)) {
    		System.out.println("Media already exists.");
    	}
    	else {
    		System.out.println("Added");
    		itemsOrdered.add(media);
    	}
    }
    
    public void removeMedia(Media media) {
    	if(itemsOrdered.contains(media)) {
    		itemsOrdered.remove(media);
    		System.out.println("Removed");
    	}
    	else {
    		System.out.println("Media does not exist");
    	}
    }

  /*public void addDigitalVideoDisc(DigitalVideoDisc disc){  

        boolean check = false;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].equals(disc)){
                check = true;
                break;
            }
        }

        if (check == false){
            if(qtyOrdered < MAX_ORDERED){
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered += 1;
                System.out.printf("The disc: \"%s\" has been added.", disc.getTitle());
                System.out.println();
            }
            else{
                System.out.println("The cart is full, please remove some disc.");
            }
        }
        else{
            System.out.printf("The disc: \"%s\" had been added before.", disc.getTitle());
            System.out.println();
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for(DigitalVideoDisc disc: dvdList){
            int space = MAX_ORDERED - qtyOrdered;
            if(space == 0){
                System.out.println("The cart is full, cannot add more disc.");
                return;
            }
            else{
                addDigitalVideoDisc(disc);
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        DigitalVideoDisc[] disc = {dvd1, dvd2};
        for(DigitalVideoDisc dvd: disc){
            int space = MAX_ORDERED - qtyOrdered;
            if(space == 0){
                System.out.println("The cart is full, cannot add more disc.");
                return;
            }
            else{
                addDigitalVideoDisc(dvd);
            }
        }
    }
     public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int check = 0;

        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].equals(disc)){
                System.out.printf("The disc: \"%s\" has been removed.", disc.getTitle());
                System.out.println();
                for(int j = i; j < qtyOrdered-1; j++){
                    itemsOrdered[j]= itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1]= null;
                qtyOrdered-=1;
                check=1;
                break;
            }
        }

        if(check==0){
            System.out.printf("Cannot find the disc \"%s\".", disc.getTitle());
            System.out.println();
        }
    }
     */  

   

    public float totalCost(){
        float totalcost = 0;
        for(Media media: itemsOrdered){
            totalcost+= media.getCost();
        }
        return totalcost;
    }

    public ArrayList<Media> getItemsOrdered() {
		
        return itemsOrdered;
	}

    public void toPrint(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        for(Media media: itemsOrdered) {
        	System.out.println(media.toString());
        }
        System.out.println("Total Cost: " + totalCost());
    }
    
    public void sortCartCostTitle() {
		 Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	 }
	 public void sortCartTitleCost() {
		 Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	 }

    public void searchID(int id){
        boolean found = false;
        for (Media media: itemsOrdered){
            if(media == null){
                break;
            }
            else if(media.getId() == id){
                found = true;
                System.out.println("Found: " + media.toString());
                break;
            }
        }
        if(found == false){
            System.out.println("No match is found");
        }
    }

    public void searchTitle(String title){
        boolean found = false;
        for(Media media: itemsOrdered){
            if(media == null){
                break;
            }
            else if (media.isMatch(title)){
                System.out.println("Found: " + media.toString());
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("No match is found");
        }
    }
}
