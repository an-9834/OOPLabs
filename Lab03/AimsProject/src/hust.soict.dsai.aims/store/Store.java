public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int storeQty = 0;
	
	public Store(int storeSize) {
		super();
		this.itemsInStore = new DigitalVideoDisc[storeSize]; 
	}
	
	public void print() {
		for (DigitalVideoDisc disc : itemsInStore) {
			 if (disc == null) {
				 break;
			 }
			 else {
				 System.out.println(disc.getID() + ". " + disc.toString());
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
}