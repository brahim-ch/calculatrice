package sample;
import java.lang.Exception;
/**
 * Created by brahim on 12/10/16.
 */
public class functionality {
    public float calculate(long num1, long num2,String operator){
        switch (operator){
            case "+":
                return num1+num2;
            case "-":
                return  num1-num2;
            case "*":
                return num1*num2;
            case "/":
                if (num2 == 0){
                    return  num1-num2;
                }
                return  num1/num2;
            default:
                return 0;
        }
    }
}
