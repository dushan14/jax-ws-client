package com.training.soapclient;

import com.training.welcomeservice.WelcomeService;
import com.training.welcomeservice.WelcomeServiceService;

public class Client {

    public static void main(String[] args) {

        WelcomeService welcomeService = new WelcomeServiceService().getWelcomeServicePort();

        String s = welcomeService.welcome();

        System.out.println("output: "+s);

    }
}
