
public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
	private int id;

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public int getID(){
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title) {
    	super();
        this.title = title;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs += 1;
        this.id = nbDigitalVideoDiscs;
    }

    public String toString(){
        String linePrint;
        if (length != 0){
            linePrint = "DVD - " + title + " - " + category + " - " + length + ": " + cost + "$";
        } else {
            linePrint = "DVD - " + title + " - " + category + " - " + cost + "$";
        }
        return linePrint;
    }

    public boolean isMatch(String title) {
		String [] keyword = title.toLowerCase().split(" ");
		String tmp = this.getTitle().toLowerCase();
		for(String key : keyword) {
			if(tmp.contains(key)) return true;
		}
		return false;
	}

}