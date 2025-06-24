package com.yal.wiki.utils;

import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.jasypt.util.text.BasicTextEncryptor;

public final class JasyptEncryptorUtils {

    private static final String salt = "test666";

    private static BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();

    static {
        basicTextEncryptor.setPassword(salt);
    }

    private JasyptEncryptorUtils(){}

    /**
     * 明文加密
     * @param plaintext
     * @return
     */
    public static String encode(String plaintext){
        System.out.println("明文字符串：" + plaintext);
        String ciphertext = basicTextEncryptor.encrypt(plaintext);
        return ciphertext;
    }

    /**
     * 解密
     * @param ciphertext
     * @return
     */
    public static String decode(String ciphertext){
        ciphertext = "ENC(" + ciphertext + ")";
        if (PropertyValueEncryptionUtils.isEncryptedValue(ciphertext)){
            String plaintext = PropertyValueEncryptionUtils.decrypt(ciphertext,basicTextEncryptor);
            return plaintext;
        }
        System.out.println("解密失败");
        return "";
    }

    public static void main(String[] args) {
        // 需要加密的明文
        String plaintext = "patient113";

        // 加密明文
        String encryptedText = JasyptEncryptorUtils.encode(plaintext);
        System.out.println("加密后字符串：" + encryptedText);

        // 解密密文
        String decryptedText = JasyptEncryptorUtils.decode(encryptedText);
        System.out.println("解密后的字符串：" + decryptedText);
    }
}
