package pro.sky.HWKorzina.DTO;

import java.util.Objects;

public class Tovar {
    private int tovarID;
    private String tovarName;
    private double tovarPrice;
    private int tovarQuantity;

    public int getTovarID() {return tovarID;}

    public String getTovarName() {return tovarName;}

    public double getTovarPrice() {return tovarPrice;}

    public int getTovarQuantity() {return tovarQuantity;}

    public Tovar(int tovarID,
                 String tovarName,
                 double tovarPrice,
                 int tovarQuantity) {
        this.tovarID = tovarID;
        this.tovarName = tovarName;
        this.tovarPrice = tovarPrice;
        this.tovarQuantity = tovarQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;
        Tovar tovar = (Tovar) o;
        return tovarID == tovar.tovarID && Double.compare(tovarPrice, tovar.tovarPrice) == 0 && tovarQuantity == tovar.tovarQuantity && Objects.equals(tovarName, tovar.tovarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tovarID, tovarName, tovarPrice, tovarQuantity);
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "id = " + tovarID +
                ", Наименование = '" + tovarName + '\'' +
                ", цена = " + tovarPrice +
                ", количество в корзине = " + tovarQuantity +
                '}';
    }
}
