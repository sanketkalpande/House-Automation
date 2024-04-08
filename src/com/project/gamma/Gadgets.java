package com.project.gamma;

public class Gadgets implements Usable {

	String name;
	boolean status;
	
	public Gadgets() {

	}

	public Gadgets(String name) {
		super();
		this.name = name;
		this.status=false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public void turnOn() {
		if(status==false)
		{
			status=true;
			System.out.println(this.name+ " Turned On");
		}
		else
		{
			System.out.println(this.name+ " Already On");
		}
	}
	@Override
	public void turnOff() {
		if(status==true)
		{
			status=false;
			System.out.println(this.name+ " Turned Off");
		}
		else
		{
			System.out.println(this.name+ " Already Off");
		}
	}
	
}
