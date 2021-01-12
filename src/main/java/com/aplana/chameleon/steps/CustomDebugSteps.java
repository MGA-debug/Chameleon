package com.aplana.chameleon.steps;


import io.qameta.allure.Step;
import org.springframework.stereotype.Component;

@Component
public class CustomDebugSteps extends AbstractSteps {

    public CustomDebugSteps() {
    }

    @Step("debug")
    public void stepDebug() {
        System.out.println("debug");
    }
}
