[ program -1  wap to calculate numbers using class and objects](# assi-1)

[ program -2  wap to add strings](# assi-2)
## assi-1
```
import java.util.Scanner;

class Calculator {
    int a, b;

    void getValues(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division by zero not allowed");
        }
    }
}

public class calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculator obj = new Calculator();
        obj.getValues(x, y);

        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
```
<img width="743" height="175" alt="image" src="https://github.com/user-attachments/assets/f0860a82-473a-46ff-9681-3db83780024d" />


## assi-2
```
class ayu{
public static void main(String[] args){
System.out.println(args[0]);
String s=args[0]+args[1];
System.out.println(s);
}
}
```
<img width="733" height="866" alt="image" src="https://github.com/user-attachments/assets/6b6b9441-1869-42bf-bdc8-81872e6b925f" />

