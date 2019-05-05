package provider;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;

public class MyKeypair extends KeyPairGeneratorSpi{
	
	@Override
	public KeyPair generateKeyPair() {
		// TODO Auto-generated method stub
		System.out.print("from KeyPair ");
		MyInterface.sayHello();
		return null;
	}

	@Override
	public void initialize(int arg0, SecureRandom arg1) {
		// TODO Auto-generated method stub
		
	}

}
