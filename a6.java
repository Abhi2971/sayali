// Write a Java program to read ‘N’ names of your friends, store them in HashSet, and display them in ascending order.
import java.util.*;
public class a6 {
	public static void main(String[] args){
		Set<String> friends = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many friends");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("friend "+(i+1));
			friends.add(sc.nextLine());		
		}
		Set<String> Friends = new TreeSet<>(friends);
		System.out.println("Ascending Order is "+Friends);
	}
}

