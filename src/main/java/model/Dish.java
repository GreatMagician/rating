package model;

/**
 * Created by Александр on 26.10.2016.
 * Блюдо
 */
public class Dish extends NamedEntity
{
    private Double price;

    public Dish(){}
    public Dish(Integer id, String name) {
        super(id, name);
    }

    public Dish(Integer id, String name, Double price) {
        super(id, name);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
