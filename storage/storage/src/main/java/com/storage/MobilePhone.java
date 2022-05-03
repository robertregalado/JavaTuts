package com.storage;

/**
One consideration when buying a new phone is the storage. With a lot of helpful apps online,
our storage must be able to handle all the apps we want to install.

Create a mobile phone class which accepts the model and the storage in GB.
This class can accept multiple applications, the application class accepts the
application name and application size which is in MB.

Create a function installApplication and removeApplication, which lets you add
or remove apps as long as you don't exceed your storage.

Create a function which returns the total storage used, the list of applications installed,
and the top 5 largest apps(in descending order, in case the number of installed applications
 is less than five return the maximum number installed).
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobilePhone {
    private String model;
    private int storage;
    List<Application> applications = new ArrayList<Application>();
    int totalStorageUsed;
    int largeSizeApp;

    MobilePhone(String model, int storage) {
        this.model = model;
        this.storage = storage;
        totalStorageUsed = 0;
        largeSizeApp = 0;

    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void installApplication(Application application) {
        if (getTotalStorageUsed() >= storage*1000){
            applications.clear();
        }
        applications.add(application);

    }

    public void uninstallApplication(Application application) {
        applications.remove(application);
    }

    public int getTotalStorageUsed() {
        for(Application app:applications){
            totalStorageUsed += app.getAppSize();
        }
        return totalStorageUsed;
    }

    public List<Application> getTopFiveLargestApps() {
        List<Application> topFive = new ArrayList<>(applications);
        topFive.sort(Comparator.comparing(Application::getAppSize).reversed());
       
        if (applications.size() < 5)
            topFive = topFive.subList(0, applications.size());
        else{
            topFive = topFive.subList(0, 5);
        }
        return topFive;

        //return applications.subList(application.getAppSize()-5, application.getAppSize());
    }
}

class Application {
    private String appName;
    private int appSize;

    Application(String appName, int appSize) {
        this.appName = appName;
        this.appSize = appSize;
    }
    //getters 
    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }
    //setter
    public void setAppSize(int appSize){
        this.appSize = appSize;
    }

}
class Main{
    public static void main(String[] args) {
        Application application1;
        Application application2;
        Application application3;
        Application application4;
        Application application5;
        Application application6;

        MobilePhone mobilePhone = new MobilePhone("Samsung S10", 8);

        List<Application> applications = new ArrayList<>();
        application1 = new Application("Dictionary", 880);
        application2 = new Application("Spotify", 774);
        application3 = new Application("Workout", 354);
        application4 = new Application("ML", 1034);
        application5 = new Application("Me Daily", 6088);
        application6 = new Application("Twitter", 1068);

        mobilePhone.installApplication(application1);
        mobilePhone.installApplication(application2);
        mobilePhone.installApplication(application3);
        mobilePhone.installApplication(application4);

        mobilePhone.uninstallApplication(application3);
        mobilePhone.uninstallApplication(application1);

        mobilePhone.installApplication(application5);



        //System.out.println(mobilePhone.getTotalStorageUsed());
        //System.out.println(application6.getAppSize());
        //System.out.println(application6.getAppName());
        //System.out.println(mobilePhone.getApplications());
        //System.out.println(mobilePhone.getApplications());
        System.out.println(mobilePhone.getTopFiveLargestApps());



    }
}

