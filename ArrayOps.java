
public class ArrayOps {
    public static void main(String[] args) {
      System.out.println(isSorted(new int[] {1, -2, 3, 4}));  
    }
    
    public static int findMissingInt (int [] array) {
        for (int i = 0; i < array.length; i++) {
            boolean inArray = false;
            for (int k = 0; k < array.length; k++) {
                if (array[k] == i) {
                    inArray = true;
                }
            
            }
        if (inArray == false) {
            return i;
            }
        }
        return array.length;
    }
    // {1, 0, 3}
    /**
     * @param array
     * @return
     */
    public static int secondMaxValue(int [] array) {
        int FirstMax = 1; // #feedback - variable names should start with lower case. i.e. firstMax.
        int SecondMax = 0;
        int temp = 0;
    
        for (int i = 0; i < array.length; i++){
            if (array[i] > SecondMax){
                SecondMax = array[i];
                if (SecondMax >= FirstMax){
                    temp = FirstMax;
                    FirstMax = SecondMax;
                    SecondMax = temp;
                }
            }
         }

        return SecondMax;
}

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int num : array1){
           if (!contains(array2, num, array2.length)){
                return false;
            }
        }
        for (int num2 : array2){
            if (!contains(array1, num2, array1.length)){
                return false;
            }
        }
    
    return true;
    }
    // #feedback - the third input (index) is not needed, you can just use array.length.
    public static boolean contains(int [] array, int value, int index) {
        for (int i = 0; i < index; i++){
            if(array[i] == value){
                return true;

            }

        }
        return false;
    }
    

    public static boolean isSorted(int [] array) {
        boolean increasing = array[0] <= array[1];
        boolean decreasing = array[0] >= array[1];

        for (int i = 1; i < array.length - 1; i++){
            if (increasing && array[i] > array[i+1]){
                return false;
            }
            if (decreasing && array[i] < array[i+1]){
                return false;
            }
        }
        
        return true;
    }

}
