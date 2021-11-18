package exception;

import java.io.FileNotFoundException;
/**
 * 
 * @author maruf
 * 
 */
public class send {
	public static void share(int i, String site) throws IllegalAccessException, FileNotFoundException, marufException {
		if (i==1 || i==10) {
			throw new IllegalAccessException();
		}else if (i==2) {
			throw new FileNotFoundException();
		} else if(i<0) {
			throw new IllegalArgumentException("negative");
		} else if (i==20) {
			throw new marufException("error");
		}
		else {
			System.err.println("no exception");
		}
	}
}
