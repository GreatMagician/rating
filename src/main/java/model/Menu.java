package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Александр on 26.10.2016.
 */
@Entity
@Table(name = "menu", uniqueConstraints = {@UniqueConstraint(columnNames = {"restaurant_id"})})
public class Menu extends NamedEntity
{
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "menu")
    @OrderBy
    private List<Dish> dishList;

    @OneToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    public Menu(Integer id, String name) {
        super(id, name);
    }

    public Menu(Integer id, String name, List<Dish> dishList) {
        super(id, name);
        this.dishList = dishList;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
