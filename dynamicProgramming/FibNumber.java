package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class FibNumber{

    static int arr[];

    static int getNthFibNum(int n){
        int result = 0;
        //declare an array for memoization
        arr = new int[n];
        System.out.println(arr.hashCode());
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
        while((line = br.readLine()) != null && !Objects.equals(br.readLine(),"q")){
            for(String numStr : line.split("\\s")){
                n = Integer.parseInt(numStr);
            }
        }
        System.out.println(getNthFibNum(n));
    }

}