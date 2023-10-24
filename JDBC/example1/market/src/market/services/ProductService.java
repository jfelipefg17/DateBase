package market.services;

import market.entities.Manufacturer;
import market.entities.Product;
import market.persistence.ProductDAO;

import java.util.Collection;
import java.util.Scanner;

public class ProductService {

    private ProductDAO dao;

    public ProductService() {
        this.dao = new ProductDAO();
    }

    public void creatProduct() throws Exception {


        Scanner read = new Scanner(System.in);
        Scanner dou = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        Product product = new Product();
        Manufacturer manufacture;
        ManufacturerService manufacturerService = new ManufacturerService();

        System.out.println("=============");
        System.out.println("write name of yout product");
        String name = read.nextLine();
        System.out.println("=============");
        System.out.println("write price of the product");
        double price = dou.nextDouble();
        System.out.println("=============");
        manufacturerService.printAllManufacturer();
        System.out.println("write the id manufacturer of the product");
        int idmanuf = num.nextInt();
        System.out.println("=============");
        System.out.println("writhe the name manufacturer of the product ");
        String namemanuf = read.nextLine();

         manufacture = new Manufacturer(idmanuf,namemanuf);

        product.setName(name);
        product.setPrice(price);
        product.setIdManuf(manufacture);

        try {

            if (dao.searchProductById(product.getIdProd()) != null) {
                throw new Exception("the product already exist");
            }

            dao.safeProduct(product);
        } catch (Exception e) {
            throw (e);
        }
    }

    public Collection<Product> searchAllProducts() throws Exception {

      Collection<Product> products;
      try {

        products = dao.searchAllProducts();

      } catch (Exception e) {
        throw (e);
      }
      return products;
    }


    public void searchNameProducts() throws Exception {

        try {

            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {

                    System.out.println("Nombre: " + product.getName());

                    System.out.println("======================");
                }
            } else {
                System.out.println("No se encontraron productos.");
            }
        } catch (Exception e) {
            throw (e);
        }

    }

    public void searchNamePriceProducts() throws Exception {

        try {

            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {

                    System.out.println("Nombre: " + product.getName());
                    System.out.println("Precio: " + product.getPrice());

                    System.out.println("======================");
                }
            } else {
                System.out.println("No se encontraron productos.");
            }
        } catch (Exception e) {
            throw (e);
        }

    }

    public void lowestPrice () throws Exception {
        try {
            Product product = dao.lowestPrice();
            if (product != null ) {
                System.out.println("codigo" + product.getIdProd());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrice());
                System.out.println("fabricante" + product.getManuf());
                System.out.println("======================");

            } else {
                System.out.println("No se encontraron productos.");
            }
        }catch (Exception e) {
            throw e;
        }
    }

    public void priceBetween() {
        try {
            Collection<Product> products = dao.searchNamePriceProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {
                     if (product.getPrice() >= 120 && product.getPrice() <= 202) {
                         System.out.println("Nombre: " + product.getName());
                         System.out.println("Precio: " + product.getPrice());

                         System.out.println("======================");
                     }
                }
            } else {
                System.out.println("No se encontraron productos.");
            }

        } catch (Exception e) {
          throw new RuntimeException(e);
        }

    }

    public void portatiles() {
        try {
            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {
                    if (product.getName().toLowerCase().startsWith("port")) {
                        System.out.println("Codigo: " + product.getIdProd());
                        System.out.println("Nombre: " + product.getName());
                        System.out.println("Precio: " + product.getPrice());
                        System.out.println("Fabricante: " + product.getManuf());

                        System.out.println("======================");
                    }
                }
            } else {
                System.out.println("No se encontraron productos.");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void printAllProducts() throws Exception {

        try {

            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {


                    System.out.println("Codigo: " + product.getIdProd());
                    System.out.println("Nombre: " + product.getName());
                    System.out.println("Precio: " + product.getPrice());
                    System.out.println("Fabricante: " + product.getManuf());

                    System.out.println("======================");
                }
            } else {
                System.out.println("No se encontraron productos.");
            }
        } catch (Exception e) {
            throw (e);
        }

    }

    public void editproduct() throws Exception {


        System.out.println("write the codigo of the product you want modify");

        Scanner read = new Scanner(System.in);
        Scanner dou = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        Product product = new Product();
        Manufacturer manufacture;
        ManufacturerService manufacturerService = new ManufacturerService();
        ProductService productService = new ProductService();

        productService.printAllProducts();
        System.out.println("write the codigo of the product you want modify");
        int code = num.nextInt();

        System.out.println("=============");
        System.out.println("write name of yout product");
        String name = read.nextLine();
        System.out.println("=============");
        System.out.println("write price of the product");
        double price = dou.nextDouble();
        System.out.println("=============");
        manufacturerService.printAllManufacturer();
        System.out.println("write the id manufacturer of the product");
        int idmanuf = num.nextInt();
        System.out.println("=============");
        System.out.println("writhe the name manufacturer of the product ");
        String namemanuf = read.nextLine();

        manufacture = new Manufacturer(idmanuf,namemanuf);

        product.setName(name);
        product.setPrice(price);
        product.setIdManuf(manufacture);
        try {

            dao.modifyProduct(product,code);

        }catch (Exception e){
            throw e;
        }
    }
}
