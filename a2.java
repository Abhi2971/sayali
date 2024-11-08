public class a2 extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("hello, World");
		}
	}
	public static void main(String[] args){
	a2 thread =new a2();
	thread.start();
	}
}
