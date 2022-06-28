package com.generic;

public class FindMaxFromFloat {
    public static void main(String[] args) {
        float[] floatArray={6.9f,7.5f,5.0f};
        display(floatArray);
        findMax(floatArray);
    }
    public static void findMax(float[] array){
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
    public static void display(float[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Elements in array: "+array[i]);
        }
    }
}
