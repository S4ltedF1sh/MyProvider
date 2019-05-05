package provider;
import java.security.Provider;

public class MyProvider extends Provider {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyProvider() {
		super("MyProvider", 0.1,
				"Security Provider of the CDC group of the TU Darmstadt (provides Lindner/Peikert encryption)");
		put("KeyPairGenerator.LindnerPeikert", "provider.MyKeypair");
		put("Cipher.LindnerPeikert", "provider.MyCipher");
		//System.out.println("1");
		put("Cipher.LindnerPeikert SupportedModes", "NONE");
		put("Cipher.LindnerPeikert SupportedPaddings", "NOPADDING");
	}

}
