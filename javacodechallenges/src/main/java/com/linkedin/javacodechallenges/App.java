package com.linkedin.javacodechallenges;

import java.util.Date;

public class App 
{

    public static Date todayPlus100() {
        long today = new Date().getTime();
        long msPerDay = 86400000;

        return new Date(today + (msPerDay * 100));
    }

    public static void main( String[] args )
    {
        System.out.println("100 days from now is... " 
            + todayPlus100());
    }
}
