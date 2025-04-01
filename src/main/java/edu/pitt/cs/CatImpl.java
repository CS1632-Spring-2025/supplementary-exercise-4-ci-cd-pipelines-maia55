package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private String Name; 
	private int ID; 
	private boolean rented; 

	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.ID = id; 
		this.Name = name; 
		this.rented = false; 
	}
	
	public void rentCat() {
		// TODO: Fill in
		this.rented = true; 
	}

	public void returnCat() {
		// TODO: Fill in
		this.rented = false; 
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.Name = name; 
	}

	public String getName() {
		// TODO: Fill in
		return this.Name;
	}

	public int getId() {
		// TODO: Fill in
		return this.ID;
	}

	public boolean getRented() {
		// TODO: Fill in   
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		//FORMAT: ID 1. Jennyanydots
		return "ID " + this.ID + ". " + this.Name;

	}

}