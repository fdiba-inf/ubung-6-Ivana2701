package exercise6;
 
import java.util.Scanner;
 
public class Palindrome {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        Integer new = input.nextInt();
        String number = num.toString();
        String reversedNumber = "";
 
        assert num > 0 : "Number is not greater than 0!";
 
        for(int i = number.length()-1; i >= 0; i--){
            reversedNumber += number.charAt(i);
        }
        boolean result = true;
 
        fot(int i = 0; i < number.length(); i++){
            if(!number.charAt(i) == reversedNumber.charAt(i)){
                result = false;
                break;
            }
        }
        System.out.println("Palindrome: " + result);
    }
}