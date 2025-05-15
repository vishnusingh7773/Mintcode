
import java.util.*;

// 1. SUM OF ARRAY ELEMENT

public class assignment3_mintcode{

    public static void main (String[]args){
    int sum=0;

    Scanner Sc =new Scanner(System.in);


//taking the length of array 

    System.out.print("enter the length of array "); 
    int n=Sc.nextInt();
     int[] arr = new int[n];
     


 //taking element of array 

     for(int i=0;i<n;i++){
       arr[i]=Sc.nextInt();
       sum+=arr[i];

    }   
     System.out.print("the sum of array is:"+sum);

    }
}






//2 import java.util.*;

public class assignment3_mintcode {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // prime number counting
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            } else {

                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }
            if (isPrime == true) {
                count++;
            }
        }
        System.out.println("Prime number in array is :" + count);
    }
}







// 3 
import java.util.*;

public class assignment3_mintcode {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 67, 43, 1 };

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("max element :" + max + " and " + "min element :" + min);

    }
}








// 4
import java.util.*;

public class assignment3_mintcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}







//5
public class assignment3_mintcode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter the array element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            res[i] = sum;
        }
        System.out.println("Prefix sum of array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i]);
        }
    }
}