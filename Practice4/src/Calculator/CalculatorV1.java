package Calculator;

import java.util.Scanner;

public class CalculatorV1 {
    protected double a, b, result;
    protected char s;

    public CalculatorV1() {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("Operation: ");
        s = sc.next().charAt(0);

        if (s == '/'){
            result = a/b;
        }
        else if(s == '+'){
            result = a+b;
        }
        else if(s == '-'){
            result = a-b;
        }
        else if(s == '*'){
            result = a*b;
        }
        else {
            throw new Exception("Operation not found");
        }
            System.out.println(result);
            }
        catch(Exception ee){
            System.out.println(ee.getMessage());
        }
    }
}
