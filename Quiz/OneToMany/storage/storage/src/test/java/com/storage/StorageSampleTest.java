package com.storage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class StorageSampleTest {
    MobilePhone mobilePhone;

    List<Application> applications;
    List<Application> expected;

    Application application1;
    Application application2;
    Application application3;
    Application application4;
    Application application5;
    Application application6;

    @BeforeEach
    public void init() {
        mobilePhone = new MobilePhone("Samsung S10", 8);

        applications = new ArrayList<>();
        expected = new ArrayList<>();

        application1 = new Application("Dictionary", 880);
        application2 = new Application("Spotify", 774);
        application3 = new Application("Workout", 354);
        application4 = new Application("ML", 1034);
        application5 = new Application("Me Daily", 6088);
        application6 = new Application("Twitter", 1068);
    }

    @Test
    public void ___OO___DS___CS___SE___add_apps() {
        mobilePhone.installApplication(application1);
        mobilePhone.installApplication(application2);
        mobilePhone.installApplication(application3);
        mobilePhone.installApplication(application4);
        mobilePhone.installApplication(application5);
        mobilePhone.installApplication(application6);

        mobilePhone.uninstallApplication(application5);

        expected.add(application1);
        expected.add(application2);
        expected.add(application3);
        expected.add(application4);
        expected.add(application6);

        assertEquals(4110, mobilePhone.getTotalStorageUsed());
        assertEquals(expected, mobilePhone.getApplications());
    }


    @Test
    public void ___OO___DS___CS___SE___remove_apps() {
        mobilePhone.installApplication(application1);
        mobilePhone.installApplication(application2);
        mobilePhone.installApplication(application3);
        mobilePhone.installApplication(application4);

        mobilePhone.uninstallApplication(application3);
        mobilePhone.uninstallApplication(application1);

        mobilePhone.installApplication(application5);

        expected.add(application2);
        expected.add(application4);
        expected.add(application5);

        assertEquals(7896, mobilePhone.getTotalStorageUsed());
        assertEquals(expected, mobilePhone.getApplications());
    }


    @Test
    public void ___OO___DS___CS___SE___get_top_five() {

        mobilePhone.installApplication(application1);
        mobilePhone.installApplication(application2);
        mobilePhone.installApplication(application3);
        mobilePhone.installApplication(application6);

        expected.add(application6);
        expected.add(application1);
        expected.add(application2);
        expected.add(application3);

        assertEquals(expected, mobilePhone.
            getTopFiveLargestApps());
    }
}
