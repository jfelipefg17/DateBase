package market.services;

import market.entities.Manufacturer;
import market.persistence.ManufacturerDAO;


import java.util.Collection;

public class ManufacturerService {

    private ManufacturerDAO dao;

    public ManufacturerService() {
        this.dao = new ManufacturerDAO();
    }

    public void creatManufacturer(Manufacturer manufacturer) throws Exception {
        try {
            if (dao.searchManufacturerById(manufacturer.getIdManuf()) != null) {
                throw new Exception("the manufacturer already exist");
            }

            dao.safeManufacturer(manufacturer);
        } catch (Exception e) {
            throw (e);
        }
    }

    public Collection<Manufacturer> searchAllManufacturer() throws Exception {
        Collection<Manufacturer> manufacturer1;
        try {
//            if (dao.searchProductById(product.getId()) != null) {
//                throw new Exception("the product already exist");
//            }

            manufacturer1 = dao.searchAllManufacturer();
        } catch (Exception e) {
            throw (e);
        }
        return manufacturer1;
    }

    public Manufacturer searchManufacturerById(int idManuf) throws Exception {

        try {

            Manufacturer usuario = dao.searchManufacturerById(idManuf);

            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }

}
