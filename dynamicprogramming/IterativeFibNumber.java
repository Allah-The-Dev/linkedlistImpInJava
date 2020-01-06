package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class IterativeFibNumber{

    static int arr[];

    static int getNthFibNum(int n){
        int result = 0;
        //declare an array for memoization
        if(Objects.isNull(arr))
            arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i<n ; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
         
        return arr[n-1];
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int n = 0;
        while(!Objects.equals(line = br.readLine(),"q")){
            for(String numStr : line.split("\\s")){
                n = Integer.parseInt(numStr);
            }
        }
        System.out.println(getNthFibNum(n));
    }

}