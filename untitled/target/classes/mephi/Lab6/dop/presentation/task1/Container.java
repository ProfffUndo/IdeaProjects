package mephi.Lab6.dop.presentation.task1;

import java.util.Objects;

public class Container<T> {
    private T object;

    Container(T object){
        this.object=object;
    }

    Container(){
    object=null;
    }

    public void clear(){
        object=null;
    }

    public boolean isEmpty(){
        if (object != null){
            return false;
        }
        else return true;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Container{" +
                "object=" + object +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container<?> container = (Container<?>) o;
        return Objects.equals(object, container.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }
}
