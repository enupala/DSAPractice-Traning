package designpatterns.observer;

public class Main {
    public static void main(String[] args) {
       Product prod=new Product("Laptop",0);
       Observer emailService=new EmailService();
       Observer uiService=new UiService();
       prod.addObserver(emailService);
       prod.addObserver(uiService);
       prod.setStock(10);

    }
}
