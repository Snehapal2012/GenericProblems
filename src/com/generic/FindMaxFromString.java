package com.generic;

public class FindMaxFromString {
    public static void main(String[] args) {
        String[] strArray={"Apple","Peach","Banana"};
        display(strArray);
        findMax(strArray);
    }
    public static void findMax(String[] strArray){
        String max;
        max=strArray[0];
        for(int i=1;i<strArray.length;i++) {
            if(max.compareTo(strArray[i])<0){
                max=strArray[i];
            }
        }
        System.out.print("Maximum element is: "+max);
    }
    public static void display(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Elements in array: "+array[i]);
        }
    }
}
