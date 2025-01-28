package designpatterns.observer;

public class UiService implements Observer{
    @Override
    public void update(String productName, int stock) {
        System.out.println("the stock is available , product name is : "+productName+
                " and no of stock availbale is :  "+stock);
    }
}
