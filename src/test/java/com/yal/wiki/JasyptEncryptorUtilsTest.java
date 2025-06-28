package com.yal.wiki;

import com.yal.wiki.utils.JasyptEncryptorUtils;
import org.junit.jupiter.api.Test;

public class JasyptEncryptorUtilsTest {
    @Test
    public void getPasswordEncrypt(){
        String testPwd = JasyptEncryptorUtils.encode("bwJP3@Puzn5pQBS");
        String devPwd = JasyptEncryptorUtils.encode("wikiDev132");

        System.out.println("devPwd:     "+devPwd);
        System.out.println("testPwd:    "+testPwd);

        String test = JasyptEncryptorUtils.decode(testPwd);
        String dev= JasyptEncryptorUtils.decode(devPwd);

        System.out.println("dev:     "+dev);
        System.out.println("test:    "+test);



    }
}
