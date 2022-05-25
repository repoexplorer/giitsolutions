package giitsolutions;
/*
2-find the sum of all elements in this nested array for Ex given Array 
 let arr=[12, 10, 9, [12, [22,23,[12,34,[20,21,1,2]]]]] 
 output-178

*/
import java.util.ArrayList;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
        List<int[]> arr = new ArrayList<int[]>();
        arr.add(new int[]{12,10,9});
        arr.add(new int[]{12});
        arr.add(new int[]{22,23});
        arr.add(new int[]{12,34});
        arr.add(new int[]{20,21,1,2});
        System.out.println("Sum of the Array is : "+sum(arr));
    }
    static int sum(List<int[]> arr){
        int sum=0;
        for(int[] n:arr){
            for(int num:n){
                sum+=num;
            }
        }
        return sum;
    }
}
