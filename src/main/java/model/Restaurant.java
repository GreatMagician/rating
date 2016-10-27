package model;

import java.util.List;

/**
 * Created by Александр on 26.10.2016.
 * Ресторан
 */
public class Restaurant extends NamedEntity
{
    private Menu menu;
    private int rating;

    public Restaurant(){}

    public Restaurant(Integer id, String name) {
        super(id, name);
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Увеличить рейтинг на 1
     */
    public void addRatting(){
        rating++;
    }

    /**
     * Уменьшить рейтинг на 1
     */
    public void lowerRatting(){
        rating = (rating - 1 < 0) ? 0 : rating - 1;
    }
}
