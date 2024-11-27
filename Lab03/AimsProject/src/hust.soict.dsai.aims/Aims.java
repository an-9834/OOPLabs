import java.util.Arrays;

public class Aims {
    public static void main(String[] args) { 
        Cart anOrder = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd3);
        
        float totalCost = anOrder.totalCost();

        System.out.printf("Total Cost is: %.2f", totalCost);
        System.out.println();System.out.println();

        anOrder.addDigitalVideoDisc(dvd3);
        totalCost = anOrder.totalCost();
        System.out.printf("Total Cost is: %.2f", totalCost);
        System.out.println(); System.out.println();

        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Your cart after sorted is: " + Arrays.toString(anOrder.getItemsOrdered())); System.out.println();
        
        anOrder.searchID(1);
        System.out.println();

       anOrder.searchTitle("the lion king");
    }
}
