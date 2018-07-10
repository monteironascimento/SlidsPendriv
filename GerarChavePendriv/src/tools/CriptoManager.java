
package tools;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class CriptoManager {
    public static String cifrar(String value, byte[] chave) {
        String retorno = null;
        try {
            SecretKeySpec spec = new SecretKeySpec(chave, "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(new byte[16]);
            Cipher cifra = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cifra.init(Cipher.ENCRYPT_MODE, spec,paramSpec);
            byte[] cifrado = cifra.doFinal(value.getBytes());
            retorno = new BASE64Encoder().encode(cifrado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
    public static String decifrar(String cifra, byte[] chave) {
        String retorno = null;
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(chave, "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(new byte[16]);
            byte[] decoded = new BASE64Decoder().decodeBuffer(cifra);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec,paramSpec);
            retorno = new String(cipher.doFinal(decoded));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
}
