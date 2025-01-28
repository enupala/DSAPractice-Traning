package designpatterns.observer;

import java.util.ArrayList;

public class Product {
    String productName;
    int stock;
    ArrayList<Observer>observerList=new ArrayList<>();
    Product(String productName,int stock)
    {
        this.productName=productName;
        this.stock=stock;
    }
    void addObserver(Observer observer)
    {
        observerList.add(observer);
    }
    void removeObserver(Observer observer)
    {
        observerList.remove(observer);
    }
    void setStock(int stock){
        this.stock=stock;
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer obs: observerList)
        {
        obs.update(productName,stock);
        }
    }

}
