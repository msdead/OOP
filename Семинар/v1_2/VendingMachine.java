package Семинар.v1_2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public VendingMachine(List<Product> products){
        this.productList = products;
    }

    public VendingMachine(){
        this(new ArrayList<>());
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public String toString() {
        return productList.toString();
    }
}
