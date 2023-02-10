import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        // create a list of 30 numbers
        Integer[] list = new Integer[30];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000);
        }

        System.out.println(Arrays.toString(list));

        SelectionSort selectionSort = new SelectionSort();
        Integer[] sortedList = selectionSort.sort(list);
        System.out.println(Arrays.toString(sortedList));

    }

    public Integer[] sort(Integer[] list){
        if(list.length < 2) return list;
        Integer[] toBeSorted = list.clone();

        for (int i = 0; i < toBeSorted.length -1; i++){
           int lowestIndex = i;
            for(int j=i+1; j < toBeSorted.length; j++) {
                if( toBeSorted[j] < toBeSorted[lowestIndex]){
                    lowestIndex = j;
                }
            }

            if(lowestIndex != i){
                int temp = toBeSorted[i];
                toBeSorted[i] = toBeSorted[lowestIndex];
                toBeSorted[lowestIndex] = temp;
            }
        }
        return  toBeSorted;
    }
}
