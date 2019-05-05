package provider;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class NativeUtils {
	public static void loadFileFromJar(String path) throws IOException {
		String[] parts = path.split("/");
		String filename = parts[parts.length - 1];
		
		String dirPath = System.getProperty("java.io.tmpdir") + "providertest";
		//System.out.println(dirPath.toString());
		//System.out.println(dirPath);
		File tempDir = new File(dirPath);
		tempDir.mkdirs();
		File temp = new File(tempDir, filename);

        try (InputStream is = NativeUtils.class.getResourceAsStream(path)) {
            Files.copy(is, temp.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            temp.delete();
            throw e;
        } catch (NullPointerException e) {
            temp.delete();
            throw new FileNotFoundException("File " + path + " was not found inside JAR.");
        }
        
        try {
            System.load(temp.getAbsolutePath());
        } finally {
        	temp.deleteOnExit();
        }
	}
}