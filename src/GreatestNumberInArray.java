public class GreatestNumberInArray {

    public static void main (){
        // create a list of 30 numbers
        int[] list = new int[30];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000);
        }


        // test all the greatestProduct methods
        GreatestNumberInArray greatestNumberInArray = new GreatestNumberInArray();
        int number =greatestNumberInArray.greatestNumber(list);
        System.out.println("greatestNumber: " + number);
    }

    public int greatestNumber(int[] list){
        int greatestNumber = list[0];
        for(int i = 0; i < list.length; i++){
            if(list[i] > greatestNumber){
                greatestNumber = list[i];
            }
        }

        return greatestNumber;
    }
}
