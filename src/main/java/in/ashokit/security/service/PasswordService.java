package in.ashokit.security.service;import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public String encrypt(String text) {
		Encoder encoder=Base64.getEncoder();
		String encoderString=encoder.encodeToString(text.getBytes());
		return encoderString;
	}
	public String decrypt(String encryptText) {
		Decoder decoder=Base64.getDecoder();
		byte[] decode=decoder.decode(encryptText);
		return new String(decode);
	}
}
