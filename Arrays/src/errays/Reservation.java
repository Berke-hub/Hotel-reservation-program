package errays;

import java.util.Random;
import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ad="Ali ";
		String soyad="Bey";
		String tamIsim = ad + soyad;
		
		Random random=new Random();
		System.out.println(tamIsim);
		System.out.println("Welcome to King Hotel");
		System.out.println("Please enter your name for reservation");
		
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		
		KingHotel reservate=new KingHotel(name,0);

			System.out.println("What is your age");
			int age=scanner.nextInt();
			if(age>=18) {
				System.out.println("You can proceed");
			}
			else {
				System.out.println("You can't book a room at this age");
				System.exit(age);
			}
		System.out.println("How many people are planning to stay?");
		int people=scanner.nextInt();
		
		switch(people) {
		case 1:
			System.out.println("Check the available rooms for your reservation");
			break;
		case 2:
			System.out.println("Check the available rooms for your reservation");
			break;
			default:
				System.out.println("You should book more than one rooms for more than 2 customers");
				break;
		
		}
		
		
		int [] rooms=new int[20];
		
		KingHotel customer= new KingHotel(name, 0);
		
		
		System.out.println(customer.getName());
		
		System.out.println("Avalable rooms are as follows:");
		
		for(int x=0;x<=19;x++) {
			rooms[x]=x;
			
			if(rooms[x]%2==0 && x<=20) {
				System.out.println("Room" + rooms[x] + " is available");
			}
				
				else if(rooms[x]%2 != 0) {
					System.out.println("Room "+ rooms[x] + " is not available ");
				}
			if(rooms[x]%3==0) {
				System.out.println("Room "+ rooms[x] + " costs 125$ per night.");
			}
			else {
				System.out.println("Room " + rooms[x]+ " costs 165$ per night");
			}
			
			
			}
			
			
			
		
		Scanner bacanak= new Scanner(System.in);
		Scanner reserv=new Scanner(System.in);
		System.out.println("Choose an available room for your stay");
		int y=bacanak.nextInt();
		if(y<=19 && y%2==0) {
			System.out.println("Enjoy your stay");
		}
		else if(y>19) {
			System.out.println("The room you wish to book does not exist");
		}
		else if(y%2!=0)  {
			System.out.println("This room is currently occupied");
		}
		

	if(people>=3) {
		
		int a=reserv.nextInt();{
			
			
			
		

			if(a<=19 && a%2==0) {
				System.out.println("Enjoy your stay");
			}
			else if(a>19) {
				System.out.println("The room you wish to book does not exist");
			}
			else if(a%2!=0)  {
				System.out.println("This room is currently occupied");
			}
			
			}
	
	
	
		}
	
	}
	
	}
		
	


