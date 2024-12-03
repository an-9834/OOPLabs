package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Disc implements Playable{
	private static int nbDigitalVideoDiscs = 0;
    public DigitalVideoDisc(String title) {
    	super(title);
        nbDigitalVideoDiscs += 1;
        setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
    	super(title, category, cost);
        nbDigitalVideoDiscs += 1;
        setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
    	super(title, category, director, cost);
        
        nbDigitalVideoDiscs += 1;
        setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super(title, category, director, length, cost);
        
        nbDigitalVideoDiscs += 1;
        setId(nbDigitalVideoDiscs);
    }
    
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
    	super(id, title, category, director, length, cost);
    }

    public String toString(){
        return "Media - "  + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - "  + this.getCost() + " $";
    }
    //public String toString(){
    //    String linePrint;
    //    if (length != 0){
    //        linePrint = "DVD - " + title + " - " + category + " - " + length + ": " + cost + "$";
    //    } else {
    //        linePrint = "DVD - " + title + " - " + category + " - " + cost + "$";
    //    }
    //    return linePrint;
    //}

    public boolean isMatch(String title) {
		String [] keyword = title.toLowerCase().split(" ");
		String tmp = this.getTitle().toLowerCase();
		for(String key : keyword) {
			if(tmp.contains(key)) return true;
		}
		return false;
	}
    
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle()); 

    	System.out.println("DVD length: " + this.getLength()); 
    }

}
