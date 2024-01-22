
import java.util.Arrays;
public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
System.out.println(camelCase("  test me now "));
    }

    public static String capVowelsLowRest (String string) {
        string = lowerCase(string);
        String out = "";
        for (int i=0; i<string.length(); i++){
            char n = string.charAt(i);
            if (n == 'o' ||n == 'u' ||n == 'a' || n == 'e' || n == 'i'){
                n = (char) (n-32);
                out += n;
            } else {
                out += n;
            }
        }
    
        
        return out;
    }

    public static String lowerCase(String s) {
        int i =0; //will run from the first char ti the last
        String out = "";
        for(i=0; i<s.length(); i++){
            char n = s.charAt(i);
            if((n <= 'Z') && n >= 'A'){ // Uppercase
            n = (char) (n+32);
            } 
        out += n;
        }

        return out;
    }


    public static String camelCase (String string) {
        string = lowerCase(string);
        String out = "";
        string = deleteSpace(string);
        for (int i = 0; i < string.length(); i++){
            char n = string.charAt(i);
 
            if (i < string.length()-1 && n==' ' && i != 0){
                char m = string.charAt(i+1);
                m = (char) (m-32);
                out += m;
                // #feedback - it is sometimes confusing to increase the index inside a for loop, consider having while loops in these cases.
                i++;

                } else {
                out += n;
            
        }
    }
        return out;
    }

    public static String deleteSpace(String string){
        int counter = 0;
        while(string.charAt(counter)==' '){
            counter++;
        }
        return string.substring(counter);
    }

    // #feedback - this function is not used if I understand correctly. Please remove these next time.
    public static String camelCase1 (String string) {
        string = deleteSpace(string);
        string = lowerCase(string);
        String out = "";
            boolean isSpace = false; 

        for (int i = 0; i < string.length(); i++){
            char n = string.charAt(i);
            if(n==' '){
                isSpace = true;
            }
            if (n!=' '){
                if(isSpace&&i!=0){
                    out += (char)(n-32);
                    isSpace = false;
                }else{
                    out+=n;
                }
            }}
            return out;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            char n = string.charAt(i); // #feedback - please give variables names that are more indicative, such as currentChar.
            if (chr == n){
                count++;
            }
        }
        int[] array = new int[count];
        int arrayIndex = 0;
        for (int i = 0; i < string.length(); i++){
            char n = string.charAt(i);
            if (chr == n){
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
        return array;

    }
}
