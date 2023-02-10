import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        GreatestNumberInArray.main();
//        GreatestProductInArray.main();

//        SelectionSort.main(args);

        InsertionSort.main(args);

        Stack<Integer> stack = new Stack<>();

        for (int i =0; i <10; i++){
            stack.add(i);
            System.out.println("Stack add: " + i);
        }

        for (int i =0; i <11; i++) {
            Optional<Integer> item = stack.pop();
            if (item.isPresent()) {
                System.out.println("Stack pop: " + item);
            }
            else{
                System.out.println("Stack is empty");
            }

        }

    }

}