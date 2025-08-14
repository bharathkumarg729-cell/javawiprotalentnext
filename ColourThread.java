package college;
	public class ColourThread {
	    public static void main(String[] args) {
	        ColourTask task = new ColourTask();
	        Thread t = new Thread(task);
	        t.setName("ColourPicker");
	        t.start();
	    }
	}


