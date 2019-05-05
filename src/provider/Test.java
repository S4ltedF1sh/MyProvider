package provider;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
		MyInterface.sayHello();
		Security.addProvider(new MyProvider());
		  KeyPairGenerator keygen = KeyPairGenerator.getInstance("LindnerPeikert");
		  KeyPair kp = keygen.generateKeyPair();

		  //Cipher c = Cipher.getInstance("LindnerPeikert");
	}
}
