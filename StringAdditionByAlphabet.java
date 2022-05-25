package giitsolutions;
/*
3-Given Array Elements of Alphabet with Numbers Separated By Colon. Add The Numbers According to Alphabets and Return String Alphabet, colon  and addition separated with comma. Excepts Zero Addition 
For Ex-given Array 
 String [] arr= {"X:-1", "Y:1", "X:-4", "B:3", "X:5"}; 
 output- B:3,Y:1

*/
import java.util.HashMap;
import java.util.Map;

/*I don't understant what "Excepts zero addition" means in the given question so I am calculating all and showing in alphabetical order.*/
public class StringAdditionByAlphabet {
    public static void main(String[] args) {
        String[] arr={"X:-1","Y:1","X:-4","B:3","X:5"};
        sum(arr);
    }
    static void sum(String[] arr){
        Map<Character,Integer> sum = new HashMap<>();
        for(String a:arr){
            char[] chh = a.toCharArray();
            int val=0;
            char key='\0';
            for(char ch:chh){
                
                if(Character.isAlphabetic(ch)){
                    key=ch;
                }
                if(Character.isDigit(ch)){
                    val += Integer.parseInt(String.valueOf(ch));
                }
            }
            if(sum.containsKey(key)){
                sum.replace(key,(sum.get(key)+val));
            }
            else{
            sum.put(key, val);
            }
        }
        for(char c : sum.keySet()){
            System.out.print(c+":"+sum.get(c));
        }
    }
}
