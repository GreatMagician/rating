package model;

import javax.persistence.*;

/**
 * Created by Александр on 25.10.2016.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public class BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO, SEQUENCE, TABLE
    @Column(name = "id")
    protected Integer id;

    public BaseEntity() {
    }

    public BaseEntity(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
