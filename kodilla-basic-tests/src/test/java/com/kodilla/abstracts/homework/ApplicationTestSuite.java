package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test
    public void shouldTwoApplicationObjectsBeNotSameAndEquals() {
        Application application = new Application();
        Application application1 = new Application();

        Assertions.assertNotEquals(application, application1);
        Assertions.assertNotSame(application, application1);
    }

    @Test
    public void shouldDemonstrationApplicationWork() {
        Application application = new Application();
        Application application1 = application;

        application.demonstrationApplication();
        application1.demonstrationApplication();
    }

    @Test
    public void shouldMainBeRun() {
        String[] args = null;
        Application.main(args);
    }

}