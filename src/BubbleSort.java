import java.util.Arrays;

public class BubbleSort {

    public static void main(){
        Integer[] list1 = {5, 4, 3, 2, 1};
        Integer[] list2 = {5, 4, 3, 2, 1, 0};
        Integer[] list3 = {5, 4, 3, 2, 1, 0, -1};
        // create a list with 300 numbers
        Integer[] list4 = new Integer[300];
        for (int i = 0; i < list4.length; i++) {
            list4[i] = (int) (Math.random() * 1000);
        }

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sort(list1);
        bubbleSort.sort(list2);
        bubbleSort.sort(list3);
        bubbleSort.sort(list4);

        bubbleSort.copilotSuggestion(list1);
        bubbleSort.copilotSuggestion(list2);
        bubbleSort.copilotSuggestion(list3);
        bubbleSort.copilotSuggestion(list4);
    }


    public Integer[] sort(Integer[] unsortedList) {
        Integer[] list = unsortedList.clone();
        int unsortedEnd = list.length -1;
        boolean sorted = false;
        int loopCount = 0;
        while (!sorted){
            sorted = true;
            for(int i = 0; i < unsortedEnd; i++){
                loopCount++;
                if(list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    sorted = false;
                }
            }
            unsortedEnd--;
        }

        System.out.println("First sort list size: " + list.length);
        System.out.println("First sort loopCount: " + loopCount);

        return list;
    }

    public Integer[] copilotSuggestion(Integer[] unsortedList) {
        Integer[] list = unsortedList.clone();
        int loopCount = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                loopCount++;
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.println("Co-pilot sorted list size: "+list.length );
        System.out.println("Copilot loopCount: " + loopCount);

        return list;
    }

}
