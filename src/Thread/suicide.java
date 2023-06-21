package Thread;

public class suicide {

	public static void main(String[] args) {
		while(true) {
			threadfunc thread = new threadfunc();
			thread.start();
		}
	}
}

class threadfunc extends Thread{
	@Override
	public void run(){
		int i = 0;
    	try {
			do {
				int[] array = new int[1000000];
				i++;
				System.out.println("ThreadTest" + i);
			}while(true);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}