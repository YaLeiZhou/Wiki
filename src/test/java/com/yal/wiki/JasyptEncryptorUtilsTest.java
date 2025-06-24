package com.yal.wiki;

import com.yal.wiki.utils.JasyptEncryptorUtils;
import org.junit.jupiter.api.Test;

public class JasyptEncryptorUtilsTest {
    @Test
    public void getPasswordEncrypt(){
        String testPwd = JasyptEncryptorUtils.encode("bwJP3@Puzn5pQBS");
        String devPwd = JasyptEncryptorUtils.encode("wikiDev132");

        System.out.println("testPwd:    "+testPwd);
        System.out.println("devPwd:     "+devPwd);
    }
}
