package StackImplementation;

import java.util.Stack;

public class StackImp {
    public static void main(String[] args){
        Stack <Integer> stack = new Stack<Integer>();
        //Adding Elements to Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        //Removing Elements from Stack
        stack.pop();
        // updating the stack Elemnts
        stack.set(2,100);
        // Accessing Elements
        System.out.println(stack.get(3));
        // loop throw Elements
         for(Integer i : stack){
            System.out.println(i);
        }
    }
}
