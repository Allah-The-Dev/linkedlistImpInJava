package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class FibNumber{

    static int arr[];

    static int getNthFibNum(int n){
        int result = 0;
        //declare an array for memoization
        if(Objects.isNull(arr))
            arr = new int[n];
        
        //check if value is present then return
        if(arr[n-1] != 0)
            return arr[n-1];

        //apply recursion
        if(n == 1 || n == 2)
            result = 1;
        else
            result = getNthFibNum(n-2) + getNthFibNum(n-1);
        //store new result into array
        arr[n-1] = result;
        return result;
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