// Write a Java program to read ‘n’ names of friends using a LinkedList and display using ListIterator.
import java.util.*;

public class a7{
	public static void main(String[] args){
	List<String> friend = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("how many friends ");
	int n=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<n;i++){
		System.out.println("friend "+ (i+1));
		friend.add(sc.nextLine());
		}
	ListIterator<String> fr = friend.listIterator();
	while(fr.hasNext())
	{
		System.out.println(fr.next());	
	}
	}
}
