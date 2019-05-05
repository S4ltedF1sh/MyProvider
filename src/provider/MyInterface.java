package provider;
import java.io.IOException;

public class MyInterface {
	static {
		//try {
			//System.loadLibrary("src/lp/LPLib");
		//} catch (Exception e){
			try {
				NativeUtils.loadFileFromJar("/lib.dll");
			} catch (IOException e1) {
				System.out.println("error!!!");
			}
		//}
	}

	 public native static void sayHello();
	 
	   
}
