package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public Book(int id, String title, String category, float cost) {
		//TODO	Auto-generated constructor stub
		super();
		setId(id);
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
	
	public void addAuthor() {
		
	}
	
	public void removeAuthor() {
		
	}
	
	
}
