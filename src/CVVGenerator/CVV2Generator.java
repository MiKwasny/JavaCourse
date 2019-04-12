package CVVGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piotr
 */

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class CVV2Generator {

    public static String defaultCoding = "UTF-8";
    public static String defaultEncryptionDesKeyToCVV2 = "ssfgy5olk32mb6z9";

    private static String coding;
    private static String encryptionDesKeyToCVV2;

    public CVV2Generator(String coding, String encryptionKey) {
        this.coding = coding;
        this.encryptionDesKeyToCVV2 = encryptionKey;
    }

    private Key createDESKey(String key) {
        try {
            byte[] desKeyData = key.getBytes(coding);
            KeySpec desKeySpec = new DESKeySpec(desKeyData);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            return keyFactory.generateSecret(desKeySpec);
        }
        catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
        catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String encryptDES(String data) {
        //Key DES_KEY = createDESKey(ENCRYPTION_DES_KEY);
        Key DES_KEY = createDESKey(encryptionDesKeyToCVV2);
        try {
            Cipher c1 = Cipher.getInstance("DES");
            c1.init(Cipher.ENCRYPT_MODE, DES_KEY);
            byte[] out = c1.doFinal(data.getBytes(coding));
            return DatatypeConverter.printBase64Binary(out);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String generateCVV2(String cardNo) throws Exception {
        if (cardNo == null || cardNo.length() < 13)
            throw new Exception("Error: minimum length of cardNo is 13");
        String dataString = encryptDES(cardNo);
        char[] dataIn = dataString.toCharArray();
        int[] dataOut = new int[3];
        dataOut[0] = dataIn[2] % 10;
        dataOut[1] = dataIn[dataIn.length / 2] % 10;
        dataOut[2] = dataIn[dataIn.length - 4] % 10;
        return String.valueOf(dataOut[0]) + String.valueOf(dataOut[1]) + String.valueOf(dataOut[2]);
    }

}

