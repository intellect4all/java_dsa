import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// write a function that takes an array of integers and a target integer
// and returns the indices of the two numbers that add up to the target
public class TwoSumArray {

    public static void main(String[] args) {
//        int[] list = { 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int target = 10;

        TwoSumArray twoSumArray = new TwoSumArray();


//        for (int[] index : indices) {
//            System.out.println("values: " + index[0] + " " + index[1]);
//        }
//

//        for (int[] index : coPilot) {
//            System.out.println("values: " + index[0] + " " + index[1]);
//        }

        // make the test above harder
        int[]   list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000);
        }
        int target = 1000;

        List<int[]> indices = twoSumArray.twoSum(list, target);
        for (int[] index : indices) {
            System.out.println("values: " + index[0] + " " + index[1]);
        }

        List<int[]> coPilot= twoSumArray.twoSumCoPilot(list, target);
        for (int[] index : coPilot) {
            System.out.println("values: " + index[0] + " " + index[1]);
        }
    }

    public  List<int[]> twoSumCoPilot(int[] list, int target) {
        int[] indices = new int[2];
        List<int[]> allPossibleIndices = new ArrayList<int[]>();
        int steps = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                steps++;
                if (list[i] + list[j] == target) {
                    allPossibleIndices.add(new int[]{list[i], list[j]});
                }
            }
        }
        System.out.println("co pilot steps: " + steps);
        return allPossibleIndices;
    }

    public  List<int[]> twoSum(int[] list, int target) {
        // create a map of the list
        Map<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];
        List<int[]> allPossibleIndices = new ArrayList<>();

        // loop through the list
        int steps = 0;
        for (int i = 0; i < list.length; i++) {
            // check if the map contains the difference between the target and the current number

            if (map.containsKey(target - list[i])) {
                // if it does, return the index of the current number and the index of the difference



                allPossibleIndices.add(new int[]{target - list[i], list[i]});
            }
            // if it doesn't, add the current number to the map
            steps++;
            map.put(list[i], i);
        }

        // if no two numbers add up to the target, return an empty array
        System.out.println("my steps: " + steps);
        return allPossibleIndices;
    }

}
