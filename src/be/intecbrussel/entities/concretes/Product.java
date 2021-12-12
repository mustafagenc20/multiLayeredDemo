package be.intecbrussel.entities.concretes;

public class Product {
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;
    private int unitsInStock;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public Product setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Product setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public Product setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
        return this;
    }

    public Product(int id, int categoryId, String name, double unitPrice, int unitsInStock) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
    }
}
