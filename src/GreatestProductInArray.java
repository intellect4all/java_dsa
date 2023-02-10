import java.util.Arrays;
import java.util.stream.Stream;

public class GreatestProductInArray {

    public static void main(){
        // create a list of 30 numbers
        int[] list = new int[30];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000);
        }

        // test all the greatestProduct methods
        GreatestProductInArray greatestProductInArray = new GreatestProductInArray();
        greatestProductInArray.greatestProduct1(list);
        greatestProductInArray.greatestProductCopilot(list);
        greatestProductInArray.greatestProduct2(list);
    }

    public int greatestProductCopilot(int[] list) {
        int greatestProduct = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int product = list[i] * list[i + 1];
            if (product > greatestProduct) {
                greatestProduct = product;
            }
        }
        System.out.println("greatestProductCopilot: " + greatestProduct);
        return greatestProduct;
    }

    public int greatestProduct1(int[] list){
        if(list.length < 2){
            return 0;
        }

        int greatestProduct =  list[0] * list[1];

        int steps = 0;
        for(int i = 1; i < list.length - 1; i++){
            for(int j = i + 1; j < list.length; j++){
                steps++;
                int product = list[i] * list[j];
                if( i != j && product > greatestProduct){
                    greatestProduct = product;
                }
            }
        }
        System.out.println("greatestProduct1: " + greatestProduct);
        System.out.println("greatestProduct1 steps: " + steps);
        return greatestProduct;
    }

    public int greatestProduct2(int[] list){
        if(list.length < 2){
            return 0;
        }

        // the greatest product of two numbers in the list
        // is the product of the greatest and second greatest numbers

        // find the greatest number
        GreatestNumberInArray greatestNumberInArray = new GreatestNumberInArray();
        int greatestNumber = greatestNumberInArray.greatestNumber(list);

        // remove the greatest number from the list
         int[] filteredList=   Arrays.stream(list.clone()).filter(x -> x != greatestNumber).toArray();

        // find the second greatest number
        int secondGreatestNumber = greatestNumberInArray.greatestNumber(filteredList);

        int greatestProduct = greatestNumber * secondGreatestNumber;
        System.out.println("greatestProduct2: " + greatestProduct);
//        System.out.println("greatestProduct1 steps: " + steps);
        return greatestProduct ;


    }
}
