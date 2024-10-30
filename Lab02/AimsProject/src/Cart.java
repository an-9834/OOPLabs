import java.util.ArrayList;
import java.util.Arrays;

public class Cart {
	public static final int  MAX_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered= new DigitalVideoDisc[MAX_ORDERED];
    private int qtyOrdered = 0;
    public float totalCost = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc){

        /*Check to add DVD:
            1. If the disc is in the cart, print "The disc had been added before."
            2. If not, check qtyOrdered:
                + If qtyOrdered < 20, add to Cart, qtyOrdered += 1, print "The disc has been added."
                + If qtyOrdered = 20, print "The cart is almost full, please remove some disc."
         */
        
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
                System.out.println("The cart is almost full, please remove some disc.");
            }
        }
        else{
            System.out.printf("The disc: \"%s\" had been added before.", disc.getTitle());
            System.out.println();
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
        for(int i = 0; i < qtyOrdered; i++){
            totalcost += itemsOrdered[i].getCost();
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
}