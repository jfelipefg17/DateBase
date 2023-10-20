package market.entities;

public class Manufacturer {

    private int idManuf;
    private String name;

    public Manufacturer() {

    }

    public Manufacturer(int id, String name) {
        this.idManuf = id;
        this.name = name;
    }

    public int getIdManuf() {
        return idManuf;
    }

    public void setIdManuf(int id) {
        this.idManuf = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + idManuf +
                ", name='" + name + '\'' +
                '}';
    }
}
