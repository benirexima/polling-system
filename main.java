package polling;

import java.util.ArrayList;
import java.util.Scanner;



public class main {
	
	ArrayList<Voter> al = new ArrayList<Voter>();
	connection cobj=new connection();
	public void dec() {
		System.out.println("1.Enter the voter details ");
		System.out.println("2. candidate result ");
		Scanner sc=new Scanner(System.in);
		main obj=new main();
		for(int i=0;i<1000;i++) {
		int opt=sc.nextInt();
		
		switch (opt){
		case 1:
			obj.add();
			obj.addC();
			break;
		case 2:
			obj.choose();
			break;
		case 3:
			obj.display();
			break;
		}
		}
		}
		public void add() {
			Scanner scanner = new Scanner(System.in);
			main ob=new main();
			Voter obj = new Voter();
		for(int a=0;a<5;a++)
		{	
			System.out.println("Enter voter id : ");
			obj.setVoterId(scanner.nextInt());
			
			System.out.println("Enter the voter name : ");
			obj.setName(scanner.next());

			System.out.println("Enter enter the sex: ");
			obj.setSex(scanner.next());
			

			System.out.println("Enter the voter age: ");
			obj.setName(scanner.next());

			System.out.println("Enter enter the area: ");
			obj.setSex(scanner.next());
		     cobj.addVoter(obj);
			al.add(obj);
			System.out.println("press 2 to choose ");
		ob.display();
		ob.choose();}
		}
public void choose() {
	Scanner scanner = new Scanner(System.in);
	main ob=new main();
	Voter obj = new Voter();
	System.out.println("1.ADMK: ");
	obj.setName(scanner.next());

	System.out.println("2.DMK: ");
	obj.setSex(scanner.next());
     cobj.addVoter(obj);
	al.add(obj);
}
		public void display() {
		main ob=new main();
			for (Voter obj : al) {
				System.out.println(obj.getVoterId() + " " + obj.getName() + " " + obj.getSex()+ " " + obj.getAge() + " " + obj.getArea());
			cobj.dispVoter(obj);
			ob.dec();
		}}
		public void addC() {
			Scanner scanner = new Scanner(System.in);
			main ob=new main();
			Candidate c = new Candidate();
			
			System.out.println("Enter the partname: ");
			c.setParty_name(scanner.next());
			
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main obj1 = new main();
		obj1.dec();
	}

}
