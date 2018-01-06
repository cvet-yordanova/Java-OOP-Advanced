package interface_seggreg_dependency_inversion_lab.src.p02_services;

import com.sun.nio.sctp.SendFailedNotification;

public class OnlineStoreOrder {

    private NotificationService emailNotification;
    private NotificationService smsNotification;

    public OnlineStoreOrder(NotificationService emailNotificationService,NotificationService smsNotificationService) {
        this.emailNotification = emailNotificationService;
        this.smsNotification = smsNotificationService;
    }

    public void process() {
        if (this.smsNotification.isActive())
            this.smsNotification.sendNotification();

        if (this.emailNotification.isActive())
            this.smsNotification.sendNotification();
    }

    public static void main(String[] args) {
        NotificationService es = new EmailNotificationService(true);
        NotificationService ns = new SmsNotificationService();
        OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(ns, es);
        onlineStoreOrder.process();

    }
}
