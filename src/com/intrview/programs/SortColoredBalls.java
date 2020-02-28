package com.intrview.programs;

public class SortColoredBalls {
    
    static void sortArray(char arr[]){
        int red=0;
        int blue=arr.length-1;
        
        for(int i=0; i<=blue; i++){
            if(red < blue){
                if(arr[i] == '0'){
                    char tmp = arr[i];
                    arr[i] = arr[red];
                    arr[red] = tmp;
                    red++;
                }
                else if(arr[i] == '2'){
                    char tmp = arr[i];
                    arr[i] = arr[blue];
                    arr[blue] = tmp;
                    blue--;
                    i--;
                }
            }
        }
    }
    
    public static void main(String args[]){
        char arr[] = {'0','1','0','1','2','0','2','2'};
        
        sortArray(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] +" ");
    }
}