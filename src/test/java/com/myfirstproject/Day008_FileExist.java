package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day008_FileExist {
    @Test
    public void isExistTest(){
       // System.out.println(System.getProperty("user.dir"));
        String homeDirectory=System.getProperty("user.home");
        System.out.println(homeDirectory);
        //path of the image is homedirectory and desktop
        String pathOfFile=homeDirectory+"\\Desktop\\Hafsa.docx";
        System.out.println(pathOfFile);
        boolean isFileExist=Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isFileExist);

    }
}
