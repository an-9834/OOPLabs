
import java.util.*;

public class Cart {
	public static final int  MAX_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered= new DigitalVideoDisc[MAX_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){  

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

    public float totalCost(){
        float totalcost = 0;
        for(int i=0; i<qtyOrdered;i++){
            totalcost+= itemsOrdered[i].getCost();
        }
        return totalcost;
    }

    public String[] getItemsOrdered() {
		String[] listOrdered = new String[qtyOrdered];

		for (int i = 0; i< qtyOrdered; i++) {
			listOrdered[i] = itemsOrdered[i].getTitle();
		}

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(listOrdered));
        list.sort(null);
        return list.toArray(new String[0]);
	}

    public void toPrint(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        for (DigitalVideoDisc disc: itemsOrdered){
            if(disc == null){
                System.out.println("Total Cost: " + totalCost());
                break;
            }
            else{
                System.out.println(disc.getID() + ". " + disc.toString());
            }
        }
    }

    public void searchID(int id){
        boolean found = false;
        for (DigitalVideoDisc disc: itemsOrdered){
            if(disc == null){
                break;
            }
            else if(disc.getID() == id){
                found = true;
                System.out.println("Found: " + disc.toString());
                break;
            }
        }
        if(found == false){
            System.out.println("No match is found");
        }
    }

    public void searchTitle(String title){
        boolean found = false;
        for(DigitalVideoDisc disc: itemsOrdered){
            if(disc == null){
                break;
            }
            else if (disc.isMatch(title)){
                System.out.println("Found: " + disc.toString());
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println("No match is found");
        }
    }
}