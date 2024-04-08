package com.project.gamma;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	
		House h=new House();
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		
		while(choice!=8)
		{
			System.out.println("\t1.Add New Room");
			System.out.println("\t2.Add New Device");
			System.out.println("\t3.Turn On");
			System.out.println("\t4.Turn Off");
			System.out.println("\t5.Status of Devices");
			System.out.println("\t8.Exit");
			
			System.out.println("Enter Your Choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter room type : ");
					String rtype=sc.next();	
					Rooms nroom=new Rooms(rtype);
					h.addRooms(nroom);
					System.out.println(rtype+ " Added !!");	
				}
				break;
				case 2:
				{
					int index=1;
					System.out.println("select the room u want to add device : ");
					for(Rooms rm:h.r1)
					{
						System.out.println(index + " -> " + rm.getType());
						index++;
					}
					System.out.println("Select the Room no. : ");
					int rno=sc.nextInt();
					sc.nextLine();
					if(rno >= 1 && rno <= h.r1.size())
					{
						int ch=-1;
						do
						{
							System.out.println("\t1.AC");
							System.out.println("\t2.Fan");
							System.out.println("\t3.Shower");
							System.out.println("\t4.Tv");
							System.out.println("\t0.Exit");
							
							System.out.println("Enter the choice of devices which u want to add ");
							ch=sc.nextInt();
							if(ch >=1 && ch <=4)
							{
								System.out.println("Enter device name : ");
								String nm=sc.next();
					
								switch(ch)
								{
									case 1:
									{
										Ac a=new Ac(nm);
										h.r1.get(rno-1).addDevices(a);
										System.out.println(nm +" added !!" );
									}
									break;
									case 2:
									{
										Fan f=new Fan(nm);
										h.r1.get(rno-1).addDevices(f);
										System.out.println(nm+" Added !!");
									}
									break;
									case 3:
									{
										Shower s=new Shower(nm);
										h.r1.get(rno-1).addDevices(s);
										System.out.println(nm+" Added !!");
									}
									break;
									case 4:
									{
										Tv t=new Tv(nm);
										h.r1.get(rno-1).addDevices(t);
										System.out.println(nm+" Added!!");
									}
									break;
				
								}
							}
							else if(ch==0)
							{
								System.out.println("Thank you!!");
							}
							else
							{
								System.out.println("Invalid Device number");
							}
						}while(ch!=0);
//						
					}
					
				}
				break;
				
				case 3:
				{
					int index=1;
					System.out.println("select the room u want turn on device : ");
					for(Rooms rm:h.r1)
					{
						System.out.println(index + " -> " + rm.getType());
						index++;
					}
					System.out.println("Select the Room no. : ");
					int rno=sc.nextInt();
					sc.nextLine();
					if(rno >= 1 && rno <= h.r1.size())
					{
						int ch=0;
						while(ch!=8)
						{
							System.out.println("\t1.AC");
							System.out.println("\t2.Fan");
							System.out.println("\t3.Shower");
							System.out.println("\t4.Tv");
							System.out.println("\t8.Exit");
							
							System.out.println("Enter the choice of devices which u want to add ");
							ch=sc.nextInt();
							if(ch >=1 && ch <=4)
							{
								System.out.println("Enter Device Name :");
								String dn=sc.next();
								for(int ctr=0;ctr<h.r1.get(rno-1).gd.size();ctr++)
								{
									if(h.r1.get(rno-1).gd.get(ctr).getName().equals(dn))
									{
										h.r1.get(rno-1).gd.get(ctr).turnOn();
										break;
									}
								}
							}
						}
					}
				}
				break;
				case 4:
				{
					int index=1;
					System.out.println("select the room u want turn on device : ");
					for(Rooms rm:h.r1)
					{
						System.out.println(index + " -> " + rm.getType());
						index++;
					}
					System.out.println("Select the Room no. : ");
					int rno=sc.nextInt();
					sc.nextLine();
					if(rno >= 1 && rno <= h.r1.size())
					{
						int ch=0;
						while(ch!=8)
						{
							System.out.println("\t1.AC");
							System.out.println("\t2.Fan");
							System.out.println("\t3.Shower");
							System.out.println("\t4.Tv");
							System.out.println("\t8.Exit");
							
							System.out.println("Enter the choice of devices which u want to add ");
							ch=sc.nextInt();
							if(ch >=1 && ch <=4)
							{
								System.out.println("Enter Device Name :");
								String dn=sc.next();
								for(int ctr=0;ctr<h.r1.get(rno-1).gd.size();ctr++)
								{
									if(h.r1.get(rno-1).gd.get(ctr).getName().equals(dn))
									{
										h.r1.get(rno-1).gd.get(ctr).turnOff();
										break;
									}
								}
							}
						}
					}
				}
			
				break;
				case 5:
				{
					h.display();
				}
				break;
				default:
				{
					System.out.println("Invalid option!!!");
				}
				break;
			}
		}
		System.out.println("Thank You For Visit !!!");
	}
		
		
		
		

}
