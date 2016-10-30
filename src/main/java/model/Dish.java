package model;

import javax.persistence.*;

/**
 * Created by Александр on 26.10.2016.
 * Блюдо
 */
@Entity
@Table(name = "dish")
public class Dish extends NamedEntity
{
    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
