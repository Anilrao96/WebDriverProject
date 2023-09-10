import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecodeString {

	public static void main(String[] args) {
		String str = "test123";
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string "+new String(encodedString));
		
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("new decoded string: "+new String (decodedString));
	}

}
