import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionDecryption 
{
    private static final String Algorithm="AES";
    private static final String Secret_key="MySecretKey12345";
    public static String encrypt(String password)
    {
        try
        {
        SecretKeySpec secretkey=new SecretKeySpec(Secret_key.getBytes(), Algorithm);
        Cipher cipher=Cipher.getInstance(Algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, secretkey);
        byte[] encryptedbytes=cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptedbytes);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }
    public static String decrypt(String encrypted)
    {
        try
        {
        SecretKeySpec secretkey=new SecretKeySpec(Secret_key.getBytes(), Algorithm);
        Cipher cipher=Cipher.getInstance(Algorithm);
        cipher.init(Cipher.DECRYPT_MODE, secretkey);
        byte[] decryptedbytes=cipher.doFinal(Base64.getDecoder().decode(encrypted));
        return new String(decryptedbytes);
      }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }

}
