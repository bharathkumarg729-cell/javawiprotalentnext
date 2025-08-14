package exceptionerror;
import java.io.File;
public class CheckpathExists {

	public static void main(String[] args) {
		File my_file_dir = new File("attendance_log2.txt");
        if (my_file_dir.exists()) {
        	System.out.println("The directory or file exists.\n");
        } 
        else{
           System.out.println("The directory or file does not exist.\n");
        }
		
	}

}
