// Write a Java program to display thread name and priority.
public class a4 extends Thread{
	public void run(){
		System.out.println("Thread name "+Thread.currentThread().getName());
		System.out.println("priority "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args){
		a4 thread= new a4();
		thread.start();
	}

}
