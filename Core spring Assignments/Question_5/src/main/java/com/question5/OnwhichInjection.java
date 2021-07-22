package com.question5;

import javax.inject.Inject;

public class OnwhichInjection {
    @Inject
    private ToBeInjected gS;

    public void showGreeting(String name){
        System.out.println(gS.pass(name));
    }
}