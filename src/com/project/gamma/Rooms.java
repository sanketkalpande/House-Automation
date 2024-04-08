package com.project.gamma;

import java.util.ArrayList;

public class Rooms {

	String type;
	ArrayList <Gadgets> gd;
	
	public Rooms() {

	}

	public Rooms(String type) {
		super();
		this.type = type;
		this.gd = new ArrayList();
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}
	


	public ArrayList<Gadgets> getGd() {
		return gd;
	}

	public void setGd(ArrayList<Gadgets> gd) {
		this.gd = gd;
	}

	public void addDevices(Gadgets gds)
	{
		gd.add(gds);
	}
	
	
}
