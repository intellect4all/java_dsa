import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack<T> {
    private final List<T> data;
    Stack(){
        this.data = new ArrayList<T>();
    }

    void add(T item){
        data.add(item);
    }

    int size(){
        return data.size();
    }

    Optional<T> pop(){

        int size = data.size();
        if(size <1) return Optional.empty();
        final T item = data.get(size -1);
        data.remove(size-1);
        return Optional.of(item);
    }

    void clear(){
        data.clear();
    }

}
