package com.generic;


import java.util.Arrays;

public class SortingElements<T extends Comparable<T>>{


        public static <T extends Comparable<T>> void sortArray(T array[]){
            Arrays.sort(array);
            display(array);
        }

        public static <T> void display(T array[]){
            for(int i=0;i< array.length;i++){
                System.out.println(array[i]);
            }
        }

        public static void main(String[] args) {
            Integer a[]={20,30,36,80};
            Float b[]={4.5f,6.7f,1.2f,9.3f};
            String c[]={"peach","banana","mango","orange"};

           sortArray(a);
           sortArray(b);
           sortArray(c);
        }
    }

