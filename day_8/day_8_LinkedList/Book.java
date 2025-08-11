//Store Custom Objects in LinkedList
//Write a program to:
//•	Create a class Book with fields: id, title, and author.
//•	Create a LinkedList of Book objects.
//•	Add 3 books and display their details using a loop.


package day_8_LinkedList;

import java.util.LinkedList;

public class Book {

	int id;
	String title;
	String author;
	
	Book(int id, String title, String author){
		this.id=id;
		this.title=title;
		this.author=author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> ll = new LinkedList<>();
		
		ll.add(new Book(1,"ABC", "Rani"));
		ll.add(new Book(2,"PQR", "Ammu"));
		ll.add(new Book(3,"XYZ", "Geethu"));
		
		for(Book b: ll) {
			System.out.print(b.id+" ");
			System.out.print(b.title+" ");
			System.out.println(b.author);
		}
		
	}

}

//1 ABC Rani
//2 PQR Ammu
//3 XYZ Geethu
