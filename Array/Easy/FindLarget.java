package LeetCode.Second_Largest_Element_Array;

public class FindLarget {

    public static int FindLarge(int[] num){
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++){
            if(num[i] > largest){ // PR: 12 > 0 | SR: 35 > 12 |  TR: 1 > 35  | CI: 34 > 35 | QI: 1 > 35
                secondLargest = largest; //PR: sL = 0  | SR: sl = 12 |
                largest = num[i]; //PR: l = 12 |  SR: l = 35 |

            }else if (num[i]> secondLargest && num[i]< largest){ //TR: 1 > 12 && 1 < 35 || CR: 34 > 12 && 34 < 35|| QI: 1 > 34 && 1 < 35
                    secondLargest = num[i]; //CR: sl = 34
            }
        }

        return secondLargest; //34
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int result = FindLarge(arr);

        System.out.println("El segundo numero mas grande es: " + result);
    }
}