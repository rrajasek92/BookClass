
public class BookClass {

	private String title, author, description;
	private double price;
	private boolean isInStock;
	
	public BookClass(String title, String author,String description,double price, boolean isInStock){
			
		this.title=title;
		this.author=author;
		this.description=description;
		this.price=price;
		this.isInStock=isInStock;
	}
	public String TotalPrice(Integer numBooks){
		String total=" ";
		
		if (isInStock==true) {
			Double tPrice=numBooks*price;
			return tPrice.toString();
		}
		else return "We're out!";
		
	}
	
}
