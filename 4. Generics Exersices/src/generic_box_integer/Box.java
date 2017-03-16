package generic_box_integer;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Box<T extends Integer> {
    private T content;
    public Box(T content){
        this.content = content;
    }
    public T getContent(){
        return this.content;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.content.getClass().getName(), this.getContent());
    }
}
