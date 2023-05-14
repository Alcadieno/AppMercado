import java.util.ArrayList;
import java.util.List;

public class AppBalanca extends Products {
        private String name_client;


    public AppBalanca(String nome) {
        this.name_client = nome;

    }
    public void showProducts(){
        for(Products produtos :getItemList()){
            produtos.printInfo();
        }
    }
    public void searchProducts(String productName) {
        boolean productFound = false;
        for (Products produto : getItemList()) {
            if (produto.getProductname().equals(productName)) {
                System.out.println("Produto Existe na Lista");
                produto.printInfo();
                productFound = true;
                break;
            }
        }
        if (!productFound) {
            System.out.println("Produto Nao Existe na Lista");
        }
    }


}
