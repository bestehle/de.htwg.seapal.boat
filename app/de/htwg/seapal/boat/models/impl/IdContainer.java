package de.htwg.seapal.boat.models.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IdContainer {
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IdContainer(int id) {
		this.id = id;
	}

}