package com.practice.StreamPractice;

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        //Concise, No return type , no name , no access modifier


        //Using implementation class to constructor
        Thread t1 = new Thread(new Task());
        t1.start();

        //using Lambda Expression
        Thread t2 = new Thread(()-> System.out.println("Hello by Lambda Expression"));
        t2.start();


        //using traditional method
        SumOperation sumOperation = new SumOperation();

        System.out.println("Sum operation(using implementation class): " + sumOperation.operation(5,10));

        //using Lambda Expression
        MathOperation sumOperationUsingLambda = ((a,b)-> a+b);
        MathOperation subOperationUsingLambda = ((a,b)-> a-b);
        MathOperation mulOperationUsingLambda = ((a,b)-> a*b);
        MathOperation divOperationUsingLambda = ((a,b)-> a/b);

        System.out.println(
                "\nSum: " + sumOperationUsingLambda.operation(10,2)+
                "\nSub: " + subOperationUsingLambda.operation(10,2)+
                "\nMul: " + mulOperationUsingLambda.operation(10,2)+
                "\nDiv: " + divOperationUsingLambda.operation(10,2)
        );



    }

        public static class Task implements Runnable{
            @Override
            public void run() {
                System.out.println("Hello By Task Class");
            }
        }

        @FunctionalInterface
        interface MathOperation {
         int operation(int a, int b);
        }

        static class SumOperation implements MathOperation{

            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        }

}
