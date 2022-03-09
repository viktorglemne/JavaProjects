package com.glemne;

public class testarray {
        public static void main(String[] args) {

            //placement of value
            int arryNum[] = {2,3,4,5,4,4,3};

            //placement of index, to start at 0
            for(int counter=0;counter<arryNum.length;counter++){
                System.out.println(counter + ":" + arryNum[counter]);
            }
        }
}
