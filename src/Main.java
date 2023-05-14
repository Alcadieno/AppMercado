import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Products producto1 = new Products("Queijo",7.60,1);
        Products producto2 = new Products("Uva",4.50,2);
        Products producto3  = new Products("Melancia",3.40,3);


        producto1.addItem(producto1);
        producto2.addItem(producto2);
        producto3.addItem(producto3);

        AppBalanca cliente = new AppBalanca("Fernando");


        cliente.searchProducts("Uva");

    }
}