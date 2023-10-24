package market.persistence;

import market.entities.Manufacturer;
import market.entities.Product;
import market.services.ManufacturerService;

import java.util.ArrayList;
import java.util.Collection;

public final class ProductDAO extends DAO {

    private final ManufacturerService manufacturerService;

        public ProductDAO() {
        this.manufacturerService = new ManufacturerService();
    }

    public void safeProduct (Product p1) throws Exception {

        try {
            if (p1 == null) {
                throw new Exception("the product is null");
            }

            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)" + "VALUES ('" + p1.getIdProd() + "' , '" + p1.getName() + "' , '" + p1.getPrice() + "' , '" + p1.getManuf().getIdManuf() + "' ); ";
            cudDB(sql);

        }catch (Exception e) {
            throw e;
            //System.out.println("error " + e.getMessage() );
        }

    }

    public void modifyProduct (Product p1, int code) throws Exception {

        try {
            if (p1 == null) {
                throw new Exception("the product is null");
            }

            // todo: modify query
            String sql = "UPDATE producto SET nombre = '" + p1.getName() + "', precio = " + p1.getPrice() + ", codigo_fabricante = " + p1.getManuf().getIdManuf() + " WHERE codigo = " + code;

            cudDB(sql);



        }catch (Exception e) {
            throw e;
        }

    }

    public void deleteProduct (Product p1) throws Exception {

        try {
            if (p1 == null) {
                throw new Exception("the product is null");
            }

            // todo: modify query
            String sql = "INSERT INTO productos (id, name, price, idManuf)" + "VALUES ('" + p1.getIdProd() + "' , '" + p1.getName() + "' , '" + p1.getPrice() + "' , '" + p1.getManuf().getIdManuf() + "' ); ";

            cudDB(sql);

        }catch (Exception e) {
            throw e;
        }
    }

    public Product searchProductById(int id) throws Exception{
        try {

            String sql = "SELECT * FROM PRODUCTO " + " WHERE CODIGO = '" + id + "'";
            rDB(sql);

            Product product = null;

            while (result.next()){

                product = new Product();

                product.setIdProd(result.getInt("codigo"));
                product.setName(result.getString("nombre"));
                product.setPrice(result.getDouble("precio"));
                Integer idManufacture = result.getInt("codigo_fabricante");
                Manufacturer manufacturer = manufacturerService.searchManufacturerById(idManufacture);
                product.setIdManuf(manufacturer);
            }
            disconnectDB();
            return product;

        } catch (Exception e) {
            disconnectDB();
            throw e;
        }
    }

    public Collection<Product> searchAllProducts() throws Exception{
        try {

            String sql = "SELECT * FROM producto ";
            rDB(sql);

            Product product;
            Collection<Product> products = new ArrayList<>();
            while (result.next()){

                product = new Product();

                product.setIdProd(result.getInt("codigo"));
                product.setName(result.getString("nombre"));
                product.setPrice(result.getDouble("precio"));
                Integer idManufacture = result.getInt("codigo_fabricante");
                Manufacturer manufacturer = manufacturerService.searchManufacturerById(idManufacture);
                product.setIdManuf(manufacturer);
                products.add(product);
            }
            disconnectDB();
            return products;

        } catch (Exception e) {
            disconnectDB();
            throw e;
        }
    }

    public Collection<Product> searchNameProducts() throws Exception{
        try {

            String sql = "SELECT nombre FROM producto ";
            rDB(sql);

            Product product;
            Collection<Product> products = new ArrayList<>();
            while (result.next()){

                product = new Product();

                //product.setIdProd(result.getInt("codigo"));
                product.setName(result.getString("nombre"));
                //product.setPrice(result.getDouble("precio"));
                //Integer idManufacture = result.getInt("codigo_fabricante");
                //Manufacturer manufacturer = manufacturerService.searchManufacturerById(idManufacture);
                //product.setIdManuf(manufacturer);
                //products.add(product);
            }
            disconnectDB();
            return products;

        } catch (Exception e) {
            disconnectDB();
            throw e;
        }
    }

    public Collection<Product> searchNamePriceProducts() throws Exception{
        try {

            String sql = "SELECT nombre, precio FROM producto ";
            rDB(sql);

            Product product;
            Collection<Product> products = new ArrayList<>();
            while (result.next()){

                product = new Product();

                //product.setIdProd(result.getInt("codigo"));
                product.setName(result.getString("nombre"));
                product.setPrice(result.getDouble("precio"));
                //Integer idManufacture = result.getInt("codigo_fabricante");
                //Manufacturer manufacturer = manufacturerService.searchManufacturerById(idManufacture);
                //product.setIdManuf(manufacturer);
                products.add(product);
            }
            disconnectDB();
            return products;

        } catch (Exception e) {
            disconnectDB();
            throw e;
        }
    }

    public Product lowestPrice () throws Exception {
            try {

                String sql = "";
                rDB(sql);

                Product product = null;
                while (result.next()){

                    product = new Product();

                    product.setIdProd(result.getInt("codigo"));
                    product.setName(result.getString("nombre"));
                    product.setPrice(result.getDouble("precio"));
                    Integer idManufacture = result.getInt("codigo_fabricante");
                    Manufacturer manufacturer = manufacturerService.searchManufacturerById(idManufacture);
                    product.setIdManuf(manufacturer);
                }
                disconnectDB();
                return product;

            } catch (Exception e) {
                disconnectDB();
                throw e;
            }

    }

}


