import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Queue<T> {

    final private List<T> data;
    final int maxSize;

    Queue(int maxSize){
        this.data = new ArrayList<>();
        this.maxSize = maxSize;
    }

    void enqueue(T item){
        if(!isFull()){
            data.add(item);
        }
    }

    int size() {
        return data.size();
    }

    Optional<T> dequeue(){
        if(size() <1) return Optional.empty();

        T item = data.get(0);
        data.remove(0);
        return Optional.of(item);
    }

    boolean isFull(){
        return size() == maxSize;
    }

    Optional<T> peek(){
        if(size() <1) return Optional.empty();

        T item = data.get(0);

        return Optional.of(item);
    }
}