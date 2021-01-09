package com.library.book.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BooksApplication {

	@Autowired
	private BookRepository repository;

	@EventListener(ApplicationReadyEvent.class)
	public void loadData() {
		Book book1 = new Book("Head First Java", "Kathy Sierra & Bert Bates", "Learn Java with fun", "10.11", "https://images-na.ssl-images-amazon.com/images/I/51Gsycdh-TL.jpg");
		Book book2 = new Book("Head First Design Patterns", "Eric Freeman & Ellisabeth Freeman", "A Brain Friendly Guide", "20.11", "https://4.bp.blogspot.com/-M3dEJNN7Wr8/WxdCRO17gZI/AAAAAAAALhw/NIQ2TRqc80EttlFbssjEmgSu-te5DAT9QCEwYBhgL/s320/Head+First+Design+Pattern.jpg");
		Book book3 = new Book("Head First OO Analysis & Design", "BrettD.McLaughlin,David West,Gary P.", "Learn with fun", "21.31", "https://images-eu.ssl-images-amazon.com/images/I/51VW872boUL._SX342_QL70_ML2_.jpg");

		repository.save(book1);
		repository.save(book2);
		repository.save(book3);

	}

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

}
