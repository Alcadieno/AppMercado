import java.util.ArrayList;
import java.util.List;

public class Products {
    private String name;
    private double valueWeight;
    private int id;
    private static List<Products> itemList;

    public Products(String name, double valueWeight, int id) {
        this.name = name;
        this.valueWeight = valueWeight;
        this.id = id;
         itemList = new ArrayList<>();
    }
    public Products(){

    }

    public String getProductname() {
        return name;
    }

    public void setProductname(String name) {
        this.name = name;
    }

    public double getValueWeight() {
        return valueWeight;
    }

    public void setValueWeight(double valueWeight) {
        this.valueWeight = valueWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  void addItem(Products produto) {
        itemList.add(produto);
    }

    public static List<Products> getItemList() {
        return itemList;
    }

    public void printInfo() {
        System.out.println("---------");
        System.out.println("Nome do produto: " + getProductname());
        System.out.println("Valor a cada kg: " + "R$" + getValueWeight());
        System.out.println("---------");
    }
}