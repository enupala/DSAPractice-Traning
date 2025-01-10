package designpatterns.factory;

public class ProductFactory {
    public static Product createProduct(String productType)
    {
        if(productType.equalsIgnoreCase("cloths"))
        {
            return new Cloths();
        }
        else if (productType.equalsIgnoreCase("electronics"))
        {
            return new Electronics();
        }
        throw new IllegalArgumentException("unknown type");
    }
}
