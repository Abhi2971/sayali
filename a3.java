// Write a program where a thread sleeps for 2 seconds in a loop in reverse order from 100 to 1.
public class a3{
	public static void main(String[] args) throws InterruptedException{
		for(int i=100;i>=0;i--){
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}
