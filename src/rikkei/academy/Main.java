package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max2=max;
                max= arr[i];
            }else  if(arr[i]>max2&& arr[i]!=max){
                max2=arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE){
            System.out.println("the is no second largest nnumber");
        }else {
            System.out.println("the second largest nuber is:"+max2);
        }
    }
}
