package college;

	public class EvenoddMain {
	    public static void main(String[] args) {
	        EvenThread evenThread = new EvenThread();
	        OddThread oddThread = new OddThread();

	        evenThread.start();

	        try {
	            evenThread.join();
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }

	        oddThread.start();
	    }
	}


