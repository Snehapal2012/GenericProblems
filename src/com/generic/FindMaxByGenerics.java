package com.generic;

public class FindMaxByGenerics<T extends Comparable<T>> {
 T x,y,z;

 public FindMaxByGenerics(T x,T y,T z){
     this.x=x;
     this.y=y;
     this.z=z;
 }
 public T maximum(){
     return FindMaxByGenerics.maximum(x,y,z);
 }

    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
     T max=x;
     if(y.compareTo(max)>0){
         max=y;
     }if(z.compareTo(max)>0){
         max=z;
     }printMax(x,y,z,max);
     return max;
 }

 public static <T> void printMax(T x,T y,T z,T max){
     System.out.printf("Max of %s, %s and %s is %s\n",x,y,z,max);
 }

    public static void main(String[] args) {
        Integer xInt=7,yInt=9,zInt=4;
        Float xFlt=8.9f,yFlt=5.6f,zFlt=9.8f;
        String xStr="peach",yStr="banana",zStr="mango";
        new FindMaxByGenerics(xInt,yInt,zInt).maximum();
        new FindMaxByGenerics(xFlt,yFlt,zFlt).maximum();
        new FindMaxByGenerics(xStr,yStr,zStr).maximum();
    }
}
