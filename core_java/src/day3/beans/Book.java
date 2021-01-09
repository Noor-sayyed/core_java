package day3.beans;

public class Book {

	private int id;
    private String name;
    private String author;
    private String price;
    
    public Book() {
    	
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return author;
	}
	public void setDesignation(String designation) {
		this.author = designation;
	}
	public String getCompany() {
		return price;
	}
	public void setCompany(String company) {
		this.price = company;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", Author=" + author + ", Price=" + price + "]";
	}
	public Book(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
    
    
}
