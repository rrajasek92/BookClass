import java.util.Scanner;
public class BookMain {
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);		
		int numBooks;
		boolean boolAVB;
		String total,avb;
		System.out.println("How many books? ");
		numBooks=keyboard.nextInt();
		System.out.println("Available?(yes or no)");
		avb=keyboard.next();
		boolAVB=Bool(avb);
		BookClass book=new BookClass("Twilight", "Chris Christerson", "its a book", 29.99, boolAVB);
		total=book.TotalPrice(numBooks);
		System.out.println(total);
	
	}
	public static boolean Bool(String a){
		if(a.equals("yes")) return true;
		else return false;
	}

}
