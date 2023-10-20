package market.entities;

public class Product {

    private int idProd;
    private String name;
    private double price;
    private Manufacturer manuf;

    public Product () {
    }

    public Product(int id, String name, double price, Manufacturer manufacturer)     {
        this.idProd = id;
        this.name = name;
        this.price = price;
        this.manuf = manufacturer;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd (int idProd) {
        this.idProd = idProd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Manufacturer getManuf() {
        return manuf;
    }

    public void setIdManuf(Manufacturer manuf) {
        this.manuf = manuf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProd=" + idProd +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer=" + manuf +
                '}';
    }
}
