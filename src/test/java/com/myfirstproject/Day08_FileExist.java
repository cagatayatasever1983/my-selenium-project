package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Day08_FileExist {
    @Test
    public void isExitTest(){
        String homeDirectory=System.getProperty("user.home");
        System.out.println(homeDirectory);
        String pathOfFile=homeDirectory+"\\Desktop\\Hafsa.docx";
        System.out.println(pathOfFile);

        boolean isFileExit=Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isFileExit);
    }
}
