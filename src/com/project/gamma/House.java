package com.project.gamma;

import java.util.ArrayList;
import java.util.List;

public class House {

	List<Rooms> r1;

	public House() {
		super();
		this.r1 = new ArrayList();
	}

	public void addRooms(Rooms rm)
	{
		r1.add(rm);
	}
	
	public void display()
	{
		for(Rooms r:r1)
		{
			System.out.println("\nRoom type : "+r.getType());
			ArrayList<Gadgets> g=r.getGd();
			for(Gadgets gd:g)
			{
				System.out.println("Device : "+ gd.getName());
				System.out.println("Device : "+(gd.getStatus() ? "On" : "Off"));
			}
		}
	}
		
	
}
