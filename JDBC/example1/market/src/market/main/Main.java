package market.main;

import market.services.ManufacturerService;
import market.services.ProductService;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        boolean ss = true;
        int opt;
        Scanner read = new Scanner(System.in);
        ProductService productService = new ProductService();
        ManufacturerService manufacturerService = new ManufacturerService();
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
                    productService.searchNameProducts();
                    break;
                case 2:
                    productService.searchNamePriceProducts();
                    break;
                case 3:
                    productService.priceBetween();
                    break;
                case 4:
                    productService.portatiles();
                    break;
                case 5:
                    productService.lowestPrice();
                    break;
                case 6:
                    productService.creatProduct();
                    break;
                case 7:
                    manufacturerService.creatManufacturer();
                    break;
                case 8:
                    productService.editproduct();
                    break;
                case 9:
                    ss = false;
                    break;
                default:
                    System.out.println("wrong opt");
                    break;
            }

        }while (ss);

    }


}