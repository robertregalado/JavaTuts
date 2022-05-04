import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String model;
    private int storage;
    private List<Application> applications = new ArrayList<>();

    MobilePhone(String model, int storage) {
        //insert code
        this.model = model;
        this.storage = storage;
    }

    public String getModel() {
        //insert code
        return model;
    }

    public int getStorage() {
        //insert code
        return storage;
    }

    public List<Application> getApplications() {
        //insert code
        return applications;
    }

    public void installApplication(Application application) {
        //insert code
        applications.add(application);
    }

    public void uninstallApplication(Application application) {
        //insert code
        applications.remove(application);
    }

    public int getTotalStorageUsed() {
        //insert code
        return ;
        
    }

    public List<Application> getTopFiveLargestApps() {
        //insert code
        return applications.subList(applications.size()-5, applications.size());
    }


}

class Application {
    private String appName;
    private int appSize;

    Application(String appName, int appSize) {
        //insert code
        this.appName = appName;
        this.appSize = appSize;
    }

    public String getAppName() {
        //insert code
        return appName;
    }

    public int getAppSize() {
        //insert code
        return appSize;
    }

}