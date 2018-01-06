package interface_seggreg_dependency_inversion_lab.src.p02_services;

public class SmsNotificationService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Sms send");
    }

    public boolean isActive() {
        return false;
    }
}
