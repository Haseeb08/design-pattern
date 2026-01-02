package creational.factory.NotificationEnumBased;

//Each enum constant knows how to create its object
public enum NotificationType {

    EMAIL {
        public Notification create() {
            return new EmailNotification();
        }
    },
    SMS {
        public Notification create() {
            return new SMSNotification();
        }
    };

    public abstract Notification create();
}
