import java.util.EnumSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Q.1 program to print sum of add, multiply, divide and remainder
       System.out.println("Q.1 Please Enter First Number: ");
       try {
           int firstNum = scanner.nextInt();
           handleNumbers(firstNum);
           System.out.println("Q.1 Please Enter Second Number: ");
           int secondNum = scanner.nextInt();
           handleNumbers(secondNum);
           System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
           System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
           System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
           System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
           System.out.println(firstNum + " % " + secondNum + " = " + (firstNum % secondNum));
       }catch(InputMismatchException e){
           System.out.println("there is a mismatch "+ e.getMessage());
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
           //Q.2 program to print input multiplication to 10
       System.out.println("Q.2 Please Enter a number to get it's multiplication table:");
       try {
           int multiplications = scanner.nextInt();
           for (int i = 1; i <= 10; i++) {
               System.out.println(multiplications + " * " + i + " = " + (multiplications * i));
           }
       }catch (InputMismatchException e){
           System.out.println("there is a mismatch " + e.getMessage());
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
           //Q.3 write a java program to print the area and perimeter
       System.out.println("Q.3 Please Enter the Radius to calculate the Area and Perimeter:");
       try {
           double radius = scanner.nextDouble();
            handleNumbers(radius);
           double area = Math.PI * radius * radius;
           double perimeter = 2 * Math.PI * radius;
           System.out.println("The perimeter of a circle is: " + perimeter);
           System.out.println("The area of a circle is: " + area);
       }catch (InputMismatchException e){
           System.out.println(e.getMessage());
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
           //Q.4 find the average
       System.out.println("Q.4 Please enter the count of numbers: ");
       try {
           int count = scanner.nextInt();
           handleNumbers(count);
           double average = 0;
           for (int i = 0; i < count; i++) {
               System.out.println("Please Enter a number: ");
               int number = scanner.nextInt();
               average += number;
           }
           System.out.println("The average is : " + average / count);
       }catch (InputMismatchException e){
           System.out.println("there is a mismatch "+ e.getMessage());
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
           //Q.5 accepts three integers add first two and compare with the third
       try {
           System.out.println("Q.5 Enter first number: ");
           int first = scanner.nextInt();
           System.out.println("Q.5 Enter second number: ");
           int second = scanner.nextInt();
           System.out.println("Q.5 Enter third number: ");
           int third = scanner.nextInt();
           boolean result = (first + second) == third;
           System.out.println("the result is: " + result);
       }catch (InputMismatchException e){
           System.out.println("there is a mismatch "+ e.getMessage());
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
          scanner.nextLine();

           // Q.6 reverse a word
       System.out.println("Q.6 Enter a word you would like to reverse");
       try {
           String word = scanner.nextLine();
           handleProblems(word);
           StringBuilder str = new StringBuilder(word);
           System.out.println(word + " After reverse is : " + str.reverse());
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
           //Q.7 check if even or odd
       System.out.println("Q.7 Enter a number to check if even or odd: ");
       try {
           int evenOrOdd = scanner.nextInt();
           if (evenOrOdd % 2 == 0) {
               System.out.println(evenOrOdd + " is an even number");
           } else {
               System.out.println(evenOrOdd + " is an odd number");
           }
       }catch (InputMismatchException e){
           System.out.println("there is a mismatch "+ e.getMessage());
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
           //Q.8 Java program to convert the temperature
       System.out.println("Q.8 Enter Temperature degree:");
       try {
           double temperature = scanner.nextDouble();
           double fahrenheit = (temperature * 9 / 5) + 32;
           System.out.println("Temperature in Fahrenheit is : " + fahrenheit);
       } catch (InputMismatchException e) {
           System.out.println("there is a mismatch " + e.getMessage());
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       scanner.nextLine();
           //Q.9 get index and print the character
       System.out.println("Q.9 Please enter the words:");
       try {
           String words = scanner.nextLine();
           handleProblems(words);
           System.out.println("Enter the index number: ");
           int index = scanner.nextInt();
           System.out.println(words.charAt(index));
       } catch (InputMismatchException e) {
           System.out.println("there is a mismatch " + e.getMessage());
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }

        //Q.10 print the area and perimeter of a rectangle
        System.out.println("Q.10 Enter the rectangle width:");
        try {
            double width = scanner.nextDouble();
            handleNumbers(width);
            System.out.println("Enter the rectangle height: ");
            double height = scanner.nextDouble();
            handleNumbers(height);
            System.out.println("Area is: " + width + " * " + height + " = " + (width * height));
            System.out.println("Perimeter is: " + 2 + " * (" + width + " + " + height + ") = " + 2 * (width + height));
        }catch(InputMismatchException e){
            System.out.println("input has to be a positive number "+e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

     public static void handleNumbers(double a) throws ArithmeticException {
        if (a <= 0) {
            throw new ArithmeticException("number can't be negative or zero. ");
        }
    }
    public static void handleProblems(String word)throws Exception {
        if (word.matches(".*[0-9]*.")) {
            throw new InputMismatchException("input must be letters only");
        }
    }

}