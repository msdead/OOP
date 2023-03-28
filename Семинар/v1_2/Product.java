package Семинар.v1_2;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    @Override
    public String toString() {
        return name + " " + cost + "р.";
    }
}
