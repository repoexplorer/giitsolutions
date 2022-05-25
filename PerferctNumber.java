package giitsolutions;
/*
1-Write a program to find a perfect number in Java using Recursion or  without recursion 
Ex: 28 is a perfect number as the sum of its divisors ( 1, 2, 4, 7, 14) is equal to  the number itself 
What is a perfect number? 
In number theory, a perfect number is a positive integer that is  equal to the sum of its positive divisors, excluding the number itself.   For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect  number 

*/
public class PerferctNumber {
    public static void main(String[] args) {
        perfectNumber(29);
        int num = 28;
        System.out.println("--------- Using Recursion ----------");
        int returnedNum = perfectNumberUsingRecursion(num, num/2);
        if(num==returnedNum){
            System.out.println(num+" is a Perfect Number.");
        }else{
            System.out.println(num+" is Not a Perfect Number.");
        }
    }
    static int sum=0;
    static int perfectNumberUsingRecursion(int num, int half){
        if(half>0){
            if(num%half==0){
                sum+=half;
            }
            half--;
            perfectNumberUsingRecursion(num,half);
        }
        return sum;
    }
    static void perfectNumber(int num){
        int divSum = 0;
        for(int i=1;i<=num/2;i++){//num/2 to reduce computing time
            if(num%i==0){
                divSum+=i;
            }
        }
        /*
        //If you want to check whether a perfect number exists between 1-num (num given number)
        for(int j=2;j<=num;j++){
            for(int i=1;i<=j/2;i++){
                if(j%i==0){
                    divSum+=i;
                }
            }
            if(divSum==j){
                System.out.println(j+" is a Perfect Number");
            }
        }
        */
        if(divSum==num){
            System.out.println(num+" is a Perfect Number");
        }else{
            System.out.println(num+" is Not a Perfect Number");
        }
    } 
  
}
