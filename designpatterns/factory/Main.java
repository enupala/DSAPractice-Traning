package designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        ProductFactory pf=new ProductFactory();
        Product product=pf.createProduct("electronics");
        product.dispaly();
    }
}
