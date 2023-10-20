package market.persistence;


import market.entities.Manufacturer;

import java.util.ArrayList;
import java.util.Collection;

public final class ManufacturerDAO extends DAO {

    public void safeManufacturer (Manufacturer m1) throws Exception {

        try {
//            if (p1 == null) {
//                throw new Exception("the product is null");
//            }

            String sql = "INSERT INTO fabricante (codigo, nombre)" + "VALUES ('" + m1.getIdManuf() + "' , '" + m1.getName() + "' ); ";

            cudDB(sql);

        }catch (Exception e) {
            throw e;
            //System.out.println("error " + e.getMessage() );
        }

    }

    public void modifyManufacturer (Manufacturer m1) throws Exception {

        try {
            if (m1 == null) {
                throw new Exception("the manufacturer is null");
            }

            // todo: modify query
            String sql = "INSERT INTO fabricante (codigo, nombre)" + "VALUES ('" + m1.getIdManuf() + "' , '" + m1.getName() + "' ); ";

            cudDB(sql);

        }catch (Exception e) {
            throw e;
        }

    }

    public void deleteManufacturer (Manufacturer m1) throws Exception {

        try {
            if (m1 == null) {
                throw new Exception("the fabricante is null");
            }

            // todo: modify query
            String sql = "INSERT INTO fabricante (codigo, nombre)" + "VALUES ('" + m1.getIdManuf() + "' , '" + m1.getName() + "' ); ";

            cudDB(sql);

        }catch (Exception e) {
            throw e;
        }
    }

    public Manufacturer searchManufacturerById(int idManuf) throws Exception{
        try {

            String sql = "SELECT * FROM fabricante " + " WHERE CODIGO = '" + idManuf + "'";
            rDB(sql);

            Manufacturer manufacturer = null;

            while (result.next()){

                manufacturer = new Manufacturer();

                manufacturer.setIdManuf(result.getInt("codigo"));
                manufacturer.setName(result.getString("nombre"));

            }
            disconnectDB();
            return manufacturer;

        } catch (Exception e) {
            disconnectDB();
            throw e;
        }
    }

    public Collection<Manufacturer> searchAllManufacturer() throws Exception{
        try {

            String sql = "SELECT * FROM fabricante ";
            rDB(sql);

            Manufacturer manufacturer = null;
            Collection<Manufacturer> manufacturers = new ArrayList<>();
            while (result.next()){

                manufacturer = new Manufacturer();

                manufacturer.setIdManuf(result.getInt("codigo"));
                manufacturer.setName(result.getString("nombre"));

                manufacturers.add(manufacturer);
            }
            disconnectDB();
            return manufacturers;

        } catch (Exception e) {
            disconnectDB();
            throw e;
        }
    }

}


