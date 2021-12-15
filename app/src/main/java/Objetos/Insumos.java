package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Insumos {

    private int id;
    private String[] insumos ={"Mancuernas", "Barras", "Press banca", "Pucing Bag", "Guantes","trotadoras","cuerdas"};
    private int[]precios ={20000,10000,10000,30000,5000,450000,8500};
    private int []stock;

    public Insumos()
    {

    }

    public Insumos(int id, String[] insumos, int[] precios, int[] stock) {
        this.id = id;
        this.insumos = insumos;
        this.precios = precios;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getInsumos() {
        return insumos;
    }

    public void setInsumos(String[] insumos) {
        this.insumos = insumos;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public int[] getStock() {
        return stock;
    }

    public void setStock(int[] stock) {
        this.stock = stock;
    }

    public int anadirAdicional(int valor ,int adicional)
    {
        return valor + adicional;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insumos insumos1 = (Insumos) o;
        return id == insumos1.id && Arrays.equals(insumos, insumos1.insumos) && Arrays.equals(precios, insumos1.precios) && Arrays.equals(stock, insumos1.stock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(insumos);
        result = 31 * result + Arrays.hashCode(precios);
        result = 31 * result + Arrays.hashCode(stock);
        return result;
    }

    @Override
    public String toString() {
        return "Insumos{" +
                "id=" + id +
                ", insumos=" + Arrays.toString(insumos) +
                ", precios=" + Arrays.toString(precios) +
                ", stock=" + Arrays.toString(stock) +
                '}';
    }
}
