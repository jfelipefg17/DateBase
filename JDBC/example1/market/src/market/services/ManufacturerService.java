package market.services;

import market.entities.Manufacturer;
import market.entities.Product;
import market.persistence.ManufacturerDAO;


import java.util.Collection;
import java.util.Scanner;

public class ManufacturerService {

    private ManufacturerDAO dao;

    public ManufacturerService() {
        this.dao = new ManufacturerDAO();
    }

    public void creatManufacturer() throws Exception {

        Scanner read = new Scanner(System.in);
        
        Manufacturer manufacturer = new Manufacturer();


        System.out.println("============================");
        System.out.println("enter the manufacturer name ");
        String name = read.nextLine();


        manufacturer.setName(name);


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

    public void printAllManufacturer () throws Exception {


        try {

            Collection<Manufacturer> manufacturer1 = dao.searchAllManufacturer();
            if (manufacturer1 != null && !manufacturer1.isEmpty()) {
                for (Manufacturer manufacturer : manufacturer1) {

                    System.out.println("Codigo: " + manufacturer.getIdManuf());
                    System.out.println("Nombre: " + manufacturer.getName());

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
