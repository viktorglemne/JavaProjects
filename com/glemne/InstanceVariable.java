package com.glemne;

public class InstanceVariable {
    int myVariable;
    static int data = 30;
    public static void main(String args[]){
        InstanceVariable obj = new InstanceVariable();

        System.out.println("Value of instance variable: "+obj.myVariable);
        System.out.println("Value of static variable: "+ InstanceVariable.data);
    }
}
