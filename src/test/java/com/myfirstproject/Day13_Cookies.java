package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day13_Cookies extends TestBase {
    @Test
    public void cookiesTesti(){
        driver.get("https://www.amazon.com");
        Set<Cookie> cookiesSet=driver.manage().getCookies();
        System.out.println(cookiesSet);
        int sayac=1;
        for(Cookie each:cookiesSet){
            System.out.println(sayac+".ci cookie" + each);
            System.out.println("name"+each.getName());
            System.out.println("value"+each.getValue());
            sayac++;

        }
        //System.out.println("Toplam cookies" + sayac);
        int cookieSayisi=cookiesSet.size();
        Assert.assertTrue(cookieSayisi>5);

        for(Cookie each : cookiesSet)
        {
            if(each.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD",each.getValue());
            }
        }
        Cookie cookie=new Cookie("en sevdigim cookie","cikolatali");
       driver.manage().addCookie(cookie);
       sayac=1;
       cookiesSet=driver.manage().getCookies();

        for(Cookie each:cookiesSet){
            System.out.println(sayac+".ci cookie" + each);
            sayac++;

        }
        Assert.assertTrue(cookiesSet.contains(cookie));
        driver.manage().deleteCookieNamed("skin");
        Assert.assertTrue(!cookiesSet.contains("skin"));
        driver.manage().deleteAllCookies();
        cookiesSet=driver.manage().getCookies();
        Assert.assertTrue(cookiesSet.size()==0);


    }
}
