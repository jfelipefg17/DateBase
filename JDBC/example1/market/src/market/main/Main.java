package market.main;

import market.entities.Manufacturer;
import market.entities.Product;
import market.services.ProductService;

import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//       Product product = new Product(13,"paleta",5000,new Manufacturer(1, "Asus"));
//
//        ProductService productService = new ProductService();
////
////       productService.creatProduct(product);
//
//
//        Collection<Product> products = productService.searchAllProducts();
//
//
//
//// Verifica si la colección de productos no es nula y no está vacía
//        if (products != null && !products.isEmpty()) {
//            // Itera a través de los productos e imprime cada uno
//            for (Product product2 : products) {
//                System.out.println("ID: " + product2.getIdProd());
//                System.out.println("Nombre: " + product2.getName());
//                System.out.println("Precio: " + product2.getPrice());
//                System.out.println("ID de fabricante: " + product2.getManuf());
//                System.out.println("======================");
//            }
//        } else {
//            System.out.println("No se encontraron productos.");
//        }

        boolean ss = false;
        int opt;
        Scanner read = new Scanner(System.in);
        ProductService productService = new ProductService();

        do {

            System.out.println("1. list names of product table");
            System.out.println("==================");
            System.out.println("2. list names and price of product table");
            System.out.println("==================");
            System.out.println("3. list products with price between 120-202");
            System.out.println("==================");
            System.out.println("4. list all portatil in product table");
            System.out.println("==================");
            System.out.println("5. list name and price of product table with lowest price");
            System.out.println("==================");
            System.out.println("6. enter a product to DB");
            System.out.println("==================");
            System.out.println("7. enter a manufacturer to DB");
            System.out.println("==================");
            System.out.println("8. edit a product");
            System.out.println("==================");
            System.out.println("9. exit");
            System.out.println("==================");
            System.out.println("ANSWER");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    productService.searchAllProducts();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    ss = true;
                    break;
                default:
                    System.out.println("wrong opt");
                    break;
            }

        }while (ss);

    }


}