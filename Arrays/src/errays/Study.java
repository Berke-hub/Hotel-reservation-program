package errays;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
public class Study {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner bacanak=new Scanner(System.in);
		System.out.println("Welcome to King Hotel");
		System.out.println("Please enter your name");
		String name=bacanak.next();
		System.out.println(name);
		System.out.println("Welcome to our hotel, we hope that you enjoy your stay");
		System.out.println("Please check the availability of our rooms from the list below and choose a room"); 
	int [] ali = new int[20];

for(int c=0;c<=19;c++) {
	ali[c]=random.nextInt(2);
	
if(ali[c]==1) {
	System.out.println("Room " + (100+(c+1)) + " is available");
}
else {
	System.out.println("Room " + (100+(c+1)) + " is not available");
}
	


}
Scanner scanner = new Scanner(System.in);
int room=scanner.nextInt();
for(int b=0;b<=2;b++) {
if(ali[room]==1 && room<=20) {
	System.out.println("Your room is booked. Enjoy your stay");
}
else if (room>20) {
	continue;
}
else if (ali[room]!=1) {
	System.out.println("This room is currently occupied. Please select another room");
}

	
}
	
	




   }
}