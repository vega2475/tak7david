import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = inputValuesInArray();
        System.out.println(a);
    }



    public static int inputValuesInArray(){
        Scanner scn = new Scanner (System.in);
        System.out.println("Input size of array");
        final int SIZE = scn.nextInt();
        int[] arr = new int[SIZE];
        System.out.println("input values of array");
        for(int i = 0; i < SIZE; i++){
            arr[i] = scn.nextInt();
        }
        return solution(arr);
    }

    static int solution(int[] a){
        int counter = 0;
        int countermax = 0;
        int countermin = 0;
        for(int i = 1; i < a.length - 1; i++){
            if (a[i] > a[i-1] && a[i] > a[i+1]){
                countermax++;
            }

            if (a[i] < a[i-1] && a[i] < a[i+1]){
                countermin++;
            }
        }
        if(a[0] > a[1]){
            countermax++;
        }
        if(a[a.length - 1] > a[a.length - 2 ]){
            countermax++;
        }
        if(a[0] < a[1]){
            countermin++;
        }
        if(a[a.length - 1] < a[a.length - 2 ]){
            countermin++;
        }
        System.out.println(Arrays.toString(a));
        return countermin + countermax;
    }


}