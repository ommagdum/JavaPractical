package Exp4;
/*
Create the interface stack which has variable size, abstract methods push(),pop(),display(),
overflow() and underflow(). We need to implement 3 subclasses IntegerStack, StringStack and DoubleStack
respectively by implementing interface. All the methods in interface are declared for string. And in subclass for
integerStack convert string to integer. Same thing to all others. Create one test class and check for the working of all the
classes.
 */

import java.util.Scanner;

interface Stack{
    int size = 5;
    void push(String element);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack{
    int top, stack[];

    IntegerStack(){
        stack = new int[size];
        top = -1;
    }

    public boolean overflow(){
        if(top == size -1){
            return true;
        }
        return false;
    }

    public boolean underflow(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void push(String element){
        if(overflow()){
            System.out.println("Stack Overflow, Cant Push Element....");
        }else{
            stack[++top] = Integer.parseInt(element);
            System.out.println("Element Successfully Pushed On To The Stack.....");
        }
    }

    public void pop(){
        if(underflow()){
            System.out.println("Stack Underflow, No Element To Push");
        }else{
            System.out.println("Successfully Popped Element : "+ stack[top--]);
        }
    }

    public void display() {
        System.out.println("Stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i] + " ");
        }
    }
}

class StringStack implements Stack{
    int top;
    String stack[];

    StringStack(){
        stack = new String[size];
        top = -1;
    }

    public boolean overflow(){
        if(top == size -1){
            return true;
        }
        return false;
    }

    public boolean underflow(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void push(String element){
        if(overflow()){
            System.out.println("Stack Overflow, Cant Push Element....");
        }else{
            stack[++top] = element;
            System.out.println("Element Successfully Pushed On To The Stack.....");
        }
    }

    public void pop(){
        if(underflow()){
            System.out.println("Stack Underflow, No Element To Push");
        }else{
            System.out.println("Successfully Popped Element : "+ stack[top--]);
        }
    }

    public void display() {
        System.out.println("Stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i] + " ");
        }
    }
}

class DoubleStack implements Stack{
    int top;
    double stack[];

    DoubleStack(){
        stack = new double[size];
        top = -1;
    }

    public boolean overflow(){
        if(top == size -1){
            return true;
        }
        return false;
    }

    public boolean underflow(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void push(String element){
        if(overflow()){
            System.out.println("Stack Overflow, Cant Push Element....");
        }else{
            stack[++top] = Double.parseDouble(element);
            System.out.println("Element Successfully Pushed On To The Stack.....");
        }
    }

    public void pop(){
        if(underflow()){
            System.out.println("Stack Underflow, No Element To Push");
        }else{
            System.out.println("Successfully Popped Element : "+ stack[top--]);
        }
    }

    public void display() {
        System.out.println("Stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i] + " ");
        }
    }
}
public class StackTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice1 = 0;
        while(choice1 != 4 ){
            System.out.println(" Main Menu : ");
            System.out.println(" 1 - Integer Stack ");
            System.out.println(" 2 - String Stack");
            System.out.println(" 3 - Double Stack");
            System.out.println(" 4 - Exit");
            System.out.println(" Enter Choice : ");
            choice1 = sc.nextInt();

            switch (choice1){
                case 1 :
                    IntegerStack integerStack = new IntegerStack();
                    int choice2 = 0;
                    while(choice2 != 4){
                        System.out.println("Menu For Integer Stack : ");
                        System.out.println(" 1 - Push ");
                        System.out.println(" 2 - Pop ");
                        System.out.println(" 3 - Display ");
                        System.out.println(" 4 - Exit ");
                        System.out.println(" Enter Choice : ");
                        choice2 = sc.nextInt();


                        switch (choice2){
                            case 1 :
                                System.out.println("Enter Element To Push : ");
                                integerStack.push(sc.next());
                                break;
                            case 2 :
                                integerStack.pop();
                                break;
                            case 3 :
                                integerStack.display();
                                break;
                            case 4 :
                                continue;

                            default:
                                System.out.println("Invalid Input");
                        }
                    }
                    break;

                case 2 :
                    StringStack stringStack = new StringStack();
                    choice2 = 0;
                    while(choice2 != 4){
                        System.out.println("Menu For String Stack : ");
                        System.out.println(" 1 - Push ");
                        System.out.println(" 2 - Pop ");
                        System.out.println(" 3 - Display ");
                        System.out.println(" 4 - Exit ");
                        System.out.println(" Enter Choice : ");
                        choice2 = sc.nextInt();


                        switch (choice2){
                            case 1 :
                                System.out.println("Enter Element To Push : ");
                                stringStack.push(sc.next());
                                break;
                            case 2 :
                                stringStack.pop();
                                break;
                            case 3 :
                                stringStack.display();
                                break;
                            case 4 :
                                continue;
                            default:
                                System.out.println("Invalid Input");
                        }
                    }
                    break;

                case 3 :
                    DoubleStack doubleStack = new DoubleStack();
                    choice2 = 0;
                    while(choice2 != 4){
                        System.out.println("Menu For Double Stack : ");
                        System.out.println(" 1 - Push ");
                        System.out.println(" 2 - Pop ");
                        System.out.println(" 3 - Display ");
                        System.out.println(" 4 - Exit ");
                        System.out.println(" Enter Choice : ");
                        choice2 = sc.nextInt();


                        switch (choice2){
                            case 1 :
                                System.out.println("Enter Element To Push : ");
                                doubleStack.push(sc.next());
                                break;
                            case 2 :
                                doubleStack.pop();
                                break;
                            case 3 :
                                doubleStack.display();
                                break;
                            case 4 :
                                continue;
                            default:
                                System.out.println("Invalid Input");
                        }
                    }
                    break;

                case 4:
                    continue;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
