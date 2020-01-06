package generalproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class FindingNextCode{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] inputCodeCharArray = br.readLine().toCharArray();
        int noOfCodesNeeded = Integer.parseInt(br.readLine());

        String alphaPart = "";
        String noPartStr = "";

        for(char ch : inputCodeCharArray){
            if(Character.isAlphabetic(ch)){
                alphaPart += ch;
            }else{
                noPartStr += ch;
            }
        }
        final int sizeOfNoPartInCode = 4;
        int noPartInNo = Integer.parseInt(noPartStr);
        final String strOfZeroes = "0000";
        for(int i=0;i<noOfCodesNeeded;i++){
           if(String.valueOf(noPartInNo+1).length() > sizeOfNoPartInCode){
                noPartStr = String.valueOf(noPartInNo+1).substring(1,sizeOfNoPartInCode+1);
                noPartInNo = Integer.parseInt(noPartStr);
                char[] alphaPartCharArray = alphaPart.toCharArray();
                for(int j=alphaPartCharArray.length-1;j>=0;j--){
                    int asciiOfChar = (int)alphaPartCharArray[j];
                    if( asciiOfChar == 122){
                        alphaPartCharArray[j] = (char)97;
                    }else{
                        alphaPartCharArray[j] = (char)(asciiOfChar+1);
                    }
                }
                alphaPart = new String(alphaPartCharArray);
           }else{
                noPartInNo = noPartInNo+1;
                noPartStr = String.valueOf(noPartInNo);
                if(noPartStr.length()<sizeOfNoPartInCode){
                    noPartStr = strOfZeroes.substring(0,sizeOfNoPartInCode-noPartStr.length())+noPartStr;
                }
           }
           System.out.println(alphaPart+noPartStr);
        }
    }
}