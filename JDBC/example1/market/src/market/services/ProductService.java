package market.services;

import market.entities.Product;
import market.persistence.ProductDAO;

import java.util.ArrayList;
import java.util.Collection;

public class ProductService {

    private ProductDAO dao;

    public ProductService() {
        this.dao = new ProductDAO();
    }

    public void creatProduct(Product product) throws Exception {
        try {
//            if (dao.searchProductById(product.getManuf().getIdManuf()) != null) {
//                throw new Exception("the product already exist");
//            }

            dao.safeProduct(product);
        } catch (Exception e) {
            throw (e);
        }
    }

    public void searchAllProducts() throws Exception {
        Collection<Product> products = new ArrayList<>();
        try {

            products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                // Itera a través de los productos e imprime cada uno
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
}
