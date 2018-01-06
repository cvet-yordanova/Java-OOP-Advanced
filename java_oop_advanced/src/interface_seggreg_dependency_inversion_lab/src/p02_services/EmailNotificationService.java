package interface_seggreg_dependency_inversion_lab.src.p02_services;

public class EmailNotificationService implements NotificationService{

    private boolean isActive;

    public EmailNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    public void sendNotification() {
        System.out.println("Send Email");
    }

    public boolean isActive() {
        return this.isActive;
    }
}
