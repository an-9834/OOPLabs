public class Cart {
	public static final int  MAX_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered= new DigitalVideoDisc[MAX_ORDERED];
    private int qtyOrdered = 0;
    public float totalCost = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered<MAX_ORDERED){
            itemsOrdered[qtyOrdered]= disc;
            System.out.printf("The disc: \"%s\" has been added. ", disc.getTitle());
            System.out.println();
            qtyOrdered+=1;
        }
        else{
            System.out.println("The cart is almost full, please remove some disc.");
        }
           
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int check=0;

        for(int i=0; i < qtyOrdered; i++){
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
        for(int i=0; i<qtyOrdered;i++){
            totalCost+= itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    public String[] getItemsOrdered() {
		String[] listOrdered = new String[qtyOrdered];
		for (int i = 0; i< qtyOrdered; i++) {
			listOrdered[i] = itemsOrdered[i].getTitle();
		}
		return listOrdered;
	}
}