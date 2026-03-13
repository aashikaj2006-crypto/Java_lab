[ program -1  wap to calculate numbers using class and objects](# assi-1)

[ program -2  wap to add two distance in m,mm,cm](# assi-2)
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
import java.util.Scanner;

class Distance {
    int m, cm, mm;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meters: ");
        m = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
        System.out.print("Enter millimeters: ");
        mm = sc.nextInt();
    }

    Distance add(Distance d) {
        Distance temp = new Distance();

        temp.mm = mm + d.mm;
        temp.cm = cm + d.cm + (temp.mm / 10);
        temp.mm = temp.mm % 10;

        temp.m = m + d.m + (temp.cm / 100);
        temp.cm = temp.cm % 100;

        return temp;
    }

    void display() {
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }
}

public class Distance1 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance result;

        System.out.println("Enter first distance:");
        d1.input();

        System.out.println("Enter second distance:");
        d2.input();

        result = d1.add(d2);

        System.out.print("Total Distance = ");
        result.display();
    }
}
```
<img width="747" height="210" alt="image" src="https://github.com/user-attachments/assets/9eb93131-ec0e-4443-aaaa-782bfbbcdd31" />


