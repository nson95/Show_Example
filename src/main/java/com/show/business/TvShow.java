package com.show.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TvShow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String name;
	private String rating;
	private int length;
	private String genre;
	private String network;
	
	
	public TvShow(int iD, String name, String rating, int length, String genre, String network) {
		super();
		ID = iD;
		this.name = name;
		this.rating = rating;
		this.length = length;
		this.genre = genre;
		this.network = network;
	}


	public TvShow() {
		super();
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getNetwork() {
		return network;
	}


	public void setNetwork(String network) {
		this.network = network;
	}


	@Override
	public String toString() {
		return "Show [ID=" + ID + ", name=" + name + ", rating=" + rating + ", length=" + length + ", genre=" + genre
				+ ", network=" + network + "]";
	}
	
	
	
	

}
