package model;

/**
 * Created by Александр on 25.10.2016.
 */
public class BaseEntity
{

    protected Integer id;

    public BaseEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
