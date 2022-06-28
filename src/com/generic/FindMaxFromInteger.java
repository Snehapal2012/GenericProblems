package com.generic;

public class FindMaxFromInteger {
    public static void main(String[] args) {
        Integer[] intArray={9,7,5};
        display(intArray);
        findMax(intArray);
    }
    public static void findMax(Integer[] array){
        String[] strArray=new String[array.length];
        String max;
        for(int i=0;i<array.length;i++) {
            strArray[i] = String.valueOf(array[i]);
        }
        max=strArray[0];
        for(int i=1;i<array.length;i++) {
            if(max.compareTo(strArray[i])<0){
                max=strArray[i];
            }
        }
        System.out.print("Maximum element is: "+max);
    }
    public static void display(Integer[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Elements in array: "+array[i]);
        }
    }
}
