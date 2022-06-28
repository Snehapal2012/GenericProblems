package com.generic;

public class ExtendedGenericMethod<T extends Comparable<T>>{
        T x,y,z;

        public ExtendedGenericMethod(T x,T y,T z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
        public T maximum(){
            return ExtendedGenericMethod.maximum(x,y,z);
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
            Integer xInt=8,yInt=1,zInt=4;
            Float xFlt=3.1f,yFlt=7.6f,zFlt=4.8f;
            String xStr="peach",yStr="banana",zStr="mango";
            new ExtendedGenericMethod(xInt,yInt,zInt).maximum();
            new ExtendedGenericMethod(xFlt,yFlt,zFlt).maximum();
            new ExtendedGenericMethod(xStr,yStr,zStr).maximum();
        }
    }


