package assignment2;

class Book {
	String name;
	Author author;
	double price;
	int qty;
	
	Book(String name,Author author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	void display() {
		System.out.println("Book: "+ name);
		System.out.println("Author: "+ author.name +"(" + author.gender+")");
		System.out.println("Email: "+ author.email);
		System.out.println("Price: ₹"+ price);
		System.out.println("stock: "+ qty);
	}

}
