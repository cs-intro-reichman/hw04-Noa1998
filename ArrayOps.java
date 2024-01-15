public class ArrayOps {
    public static void main(String[] args) {
      System.out.println(findMissingInt(new int[] {1,-2,3,-4,5}));  
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
        return array.length + 1;
    }
    // {1, 0, 3}
    /**
     * @param array
     * @return
     */
    public static int secondMaxValue(int [] array) {
        int FirstMax = array[0];
        int SecondMax = array[1];
        if (FirstMax < SecondMax){
            FirstMax = array[1];
            SecondMax = array[0];
        }
        for (int i = 2; i < array.length; i++){
            if (array[i] > FirstMax){
                SecondMax = FirstMax;
                FirstMax = array[i];
            } else if (array[i] > SecondMax && array[i] != FirstMax) {
                SecondMax = array[i];
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
    public static boolean contains(int [] array, int value, int index) {
        for (int i = 0; i < index; i++){
            if(array[i] == value){
                return true;

            }

        }
        return false;
    }
    

    public static boolean isSorted(int [] array) {
        boolean isSorted = false;
        for (int i=0; i < array.length-1; i++){
            if (array[i]>array[i+1]){
                isSorted = false;
            } else {
                isSorted = true;
            }
        }
        return isSorted;
    }

}
