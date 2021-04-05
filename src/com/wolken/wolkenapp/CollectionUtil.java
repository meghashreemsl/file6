package com.wolken.wolkenapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.wolken.wolkenapp.dto.PatientDTO;
import com.wolken.wolkenapp.dto.BookDTO;

public class CollectionUtil {
	public static void main(String[] args) {
	
				
		
		
		/*	String nana="nani";
		
		Collection collection = new ArrayList();
		collection.add(new BookDTO("yana","dk",7,23,"bairappa",700,"'fiction"));
		collection.add(nana);
		collection.add(new PatientDTO("megha",5,5000,"Sush"));
		
       for (Object object : collection) {
    	   System.out.println(object);
       }*/
		

		/*BookDTO dto = new BookDTO();
		dto.setAuthor("yana");
		dto.setPublisher("dk");
		dto.setBookId(2);
		dto.setEdition(4);
		dto.setBookName("yana");
		dto.setPrice(700);
		dto.setType("ficton");
		
		
       String nana="nani";
       */
		// abstraction
	/*	List<Object> collection = new ArrayList<Object>(); // List collection = new ArrayList();  // to be specific u can add BookDTO in the place of Object // it tells that we r trying to add Object type of data
		collection.add(dto);
		collection.add(new BookDTO("yana","dk",7,23,"bairappa",700,"'fiction"));
		collection.add(nana);*/
		//collection.removeAll(collection);
	
		
		//abstraction
		//fetching the data 
	/*	Iterator<Object> itr = collection.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			System.out.println(object);
		}
		
	}*/
	
	
	
	//example 1
		
	/*  List <Integer> collection = new ArrayList();
	 * collection.add(1);
	 * collection.add(2);
	 * Iterator<Integer> itr = collection.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			System.out.println(object);
		}
		
	 *
	 */
	
		
		//example 2
	/*
	 * String nana="nani;
	 * List<BookDTO> collection = new ArrayList();
	 * collection.add(new BookDTO("yana","dk",7,23,"bairappa",700,"'fiction");
	 * collection.add(new BookDTO("yana","dk",7,23,"bairappa",700,"'fiction");
	 * collection.removeAll(collection);
	 *
	 * Iterator<BookDTO> itr = collection.iterator(); 
	 * while(itr.hasNext()) { 
	 * Object object = itr.next(); 
	 * System.out.println(object); }
	 */
	
		
		
		//example3
	
		/*  List<BookDTO> collection = new LinkedList<BookDTO>();
		  collection.add(new BookDTO("yana","dk",7,23,"bairappa",700,"'fiction"));
		  collection.add(new BookDTO("yana","dk",7,23,"bairappa",700,"'fiction"));
		//S collection.removeAll(collection);
		 
		 Iterator<BookDTO> itr = collection.iterator(); 
			  while(itr.hasNext()) {   // used to print all elements 
			 Object object = itr.next(); 
			  System.out.println(object);
			  }
	}*/
	
	/*
	 * Set<BookDTO> collection = new HashSet<BookDTO>(); collection.add(new
	 * BookDTO("yana","dk",7,23,"bairappa",700,"'fiction"));
	 * collection.addAll(collection); // collection.removeAll(collection);
	 * 
	 * Iterator<BookDTO> itr = collection.iterator(); while(itr.hasNext()) { // used
	 * to print all elements Object object = itr.next(); System.out.println(object);
	 * } }
	 */
	
	}
}
