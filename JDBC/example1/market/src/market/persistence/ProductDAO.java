package market.persistence;

import market.entities.Product;

public final class ProductDAO extends DAO {

    public void safeProduct (Product p1) throws Exception {

        try {
            if (p1 == null) {
                throw new Exception("the product is null");
            }

            String sql = "INSERT INTO productos (id, name, price, idManuf)" + "VALUES ('" + p1.getId() + "' , '" + p1.getName() + "' , '" + p1.getPrice() + "' , '" + p1.getIdManuf() + "' ); ";

            cudDB(sql);

        }catch (Exception e) {
            throw e;
        }

    }

    public void modifyProduct (Product p1) throws Exception {

        try {
            if (p1 == null) {
                throw new Exception("the product is null");
            }

            // todo: modify query
            //String sql = "INSERT INTO productos (id, name, price, idManuf)" + "VALUES ('" + p1.getId() + "' , '" + p1.getName() + "' , '" + p1.getPrice() + "' , '" + p1.getIdManuf() + "' ); ";

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
            //String sql = "INSERT INTO productos (id, name, price, idManuf)" + "VALUES ('" + p1.getId() + "' , '" + p1.getName() + "' , '" + p1.getPrice() + "' , '" + p1.getIdManuf() + "' ); ";

            cudDB(sql);

        }catch (Exception e) {
            throw e;
        }

    }


}


