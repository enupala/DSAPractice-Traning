package designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        //ProductFactory pf=new ProductFactory();
        Product product=ProductFactory.createProduct("electronics");
        product.dispaly();
    }
}
