package beans;

import utils.IDGenerator;

import java.util.Objects;

public class Entity {
    private int Id;

    public Entity(){

        this.Id = IDGenerator.getNewId();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Id == entity.Id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Id: " + Id;
    }
}
