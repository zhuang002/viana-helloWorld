import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		String name;
		
		sc = new Scanner(System.in);
		
		System.out.print("Please input your name: ");
		name = sc.nextLine();
		System.out.println("Hellow World, " + name + "!");
	}

}
