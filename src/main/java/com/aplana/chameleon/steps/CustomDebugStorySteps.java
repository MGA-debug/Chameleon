package com.aplana.chameleon.steps;

import cucumber.api.java.ru.Когда;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomDebugStorySteps extends AbstractSteps {


    @Autowired
    private CustomDebugSteps customDebugSteps;


    @Когда("^debug")
       public void stepDebug() {
        flow(() ->
                customDebugSteps.stepDebug()
        );
    }
}
