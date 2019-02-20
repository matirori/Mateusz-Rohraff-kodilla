package com.kodilla.stream;

import com.kodilla.stream.beautifer.PoemBeautifer;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        /*Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */

        PoemBeautifer poemBeautifer = new PoemBeautifer();
        poemBeautifer.beautify("Witam w Wejherowie", (text -> "ABC " + text + " ABC"));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> toUpperCase(text)));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> text.replaceAll("Wejherowie", "Gdyni ")));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> (text.split(" ", text.length()).toString()))); //do omówienia
        poemBeautifer.beautify("Witam w Wejherowie", (text -> toLowerCase(text)));
    }
}
