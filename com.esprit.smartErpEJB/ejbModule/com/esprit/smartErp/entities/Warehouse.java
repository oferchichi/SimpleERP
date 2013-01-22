package com.esprit.smartErp.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Warehouse
 *
 */
@Entity
@Table(name="tbl_warehouse")

public class Warehouse implements Serializable {

	
	private int idWarehouse;
	private String nameWarehouse;
	private static final long serialVersionUID = 1L;

	public Warehouse() {
		super();
	}   
	@Id    
	public int getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(int idWarehouse) {
		this.idWarehouse = idWarehouse;
	}   
	public String getNameWarehouse() {
		return this.nameWarehouse;
	}

	public void setNameWarehouse(String nameWarehouse) {
		this.nameWarehouse = nameWarehouse;
	}
   
}
