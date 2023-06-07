package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import br.com.projeto.model.Book;

public class ExecutarController {
	@GetMapping("/primeiro")
	public List<String> primeiro(){
		//array of strings 
		String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
		//initialize an immutable list from array using asList method
		List<String> mylist = Arrays.asList(strArray);
		//print the list
		return mylist;
	}
	@GetMapping("/segundo")

	public List<String> segundo(){
		List<String> list = new ArrayList<String>();
		//Adding elements in the list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grape");
		return list;
	}
	@GetMapping("/terceiro")

	public List<Book> terceiro(){
		//creating list of books
		List<Book> list = new ArrayList<Book>();
		//creating books
		Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2 = new Book(101,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);
		//adding books to list 
		list.add(b1);
		list.add(b2);
		list.add(b3);
		return list;
	}
}
