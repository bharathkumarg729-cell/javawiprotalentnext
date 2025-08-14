package exceptionerror;
import java.io.File;
import java.io.FilenameFilter;

public class GetFilesbyExtension {
		public static void main(String[] args) {
			File file=new File("C:\\xampp\\mysql\\bin");
			String[] list=file.list(new FilenameFilter(){
				public boolean accept(File dir,String name) {
					if(name.toLowerCase().endsWith(".dll")) {
						return true;
					}else {
						return false;
					}
				}
				
		});
			for(String f:list) {
				System.out.println(f);
			}
		}
	

}
