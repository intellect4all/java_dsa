import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        // test the sort method
        int[] list = new int[30];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000);
        }

        InsertionSort insertionSort = new InsertionSort();
        int[] sortedList = insertionSort.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(sortedList));

        // test the copilotSort method
        int[] copilotSortedList = insertionSort.copilotSort(list);
        System.out.println("Co pilot: +"+Arrays.toString(copilotSortedList));

    }

    public int[] copilotSort(int[] unsortedList) {
        if (unsortedList.length < 2) return unsortedList;
        int[] toBeSorted = unsortedList.clone();
        int steps = 0;
        for (int i = 1; i < toBeSorted.length; i++) {
            int j = i;
            while (j > 0 && toBeSorted[j] < toBeSorted[j - 1]) {
                steps++;
                int temp = toBeSorted[j];
                toBeSorted[j] = toBeSorted[j - 1];
                toBeSorted[j - 1] = temp;
                j--;
            }
        }
        System.out.println("copilotSort steps: " + steps);
        return toBeSorted;
    }

    public int[] sort(int[] unsortedList){
        if(unsortedList.length <2) return unsortedList;
        int[] list = unsortedList.clone();

        int steps = 0;
        for(int i =1; i< list.length; i++){
            int tempValue = list[i];
             int position = i - 1;
             while(position >= 0){
                 if(list[position] > tempValue){
                     steps++;
                     list[position + 1] = list[position];
                     position--;
                 }else{
                     break;
                 }
             }
             list[position +1] = tempValue;
        }
        System.out.println("sort steps: " + steps);
        return list;
    }
}
