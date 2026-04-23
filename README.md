[ program -1  wap to calculate numbers using class and objects](#assi-1)

[ program -2  wap to add two distance in m,mm,cm](#assi-2)

[ program -3  wap to add two time in hh,mm,ss](#assi-3)

[ program -4  wap to add two time in hh,mm ](#assi-4)

[ program -5  wap of any 5 prog of C lang ](#assi-5)

[ program -6  wap of class having 4 methods for 1-D Array](#assi-6)

[ program -7  wap of class with multiple methods to perform matrix operations](#assi-7)

[ program -8  wap using 3  class to print 1-100 with and without thread](#assi-8)

[ program -9  wap to synchronized all three outputs of threads using multithreading](#assi-9)

[ program -10  wap to create package of any 5 classes and import it ](#assi-10)

[ program -11  wap to create package and subpackage and import and test it](#assi-11)

[ program -12  wap to apply arrayoutofboundexception and arithmatic exception](#assi-12)

[ program -13  wap to test range of age using user defined exception](#assi-13)

[ program -14  wap of inheritance using interface and abstract classes](#assi-14)

[ program -15  wap of addition of two no using java swing](#assi-15)

[ program -16  wap of calculator in swing](#assi-16)

[ program -17  wap of matrix addition using swing class](#assi-17)

[ program -18  wap to create jframe apply 10 buttons on that after clicking on each button a new structure is created](#assi-18)

[ program -19  wap to create a jframe like paint brush with selection of color and width using only mouse](#assi-19)

[ program -20  wap to make registration form using 10 elements and send data into database](#assi-20)

[ program -21  wap of file handling(char by char)](#assi-21)

[ program -22  wap of file handling (byte by byte)](#assi-22)

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


## assi-3
```
class TimeHMS {
    int h, m, s;

    TimeHMS(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    TimeHMS add(TimeHMS t) {
        int sec = this.s + t.s;
        int min = this.m + t.m + (sec / 60);
        int hr = this.h + t.h + (min / 60);

        sec = sec % 60;
        min = min % 60;

        return new TimeHMS(hr, min, sec);
    }

    void display() {
        System.out.println(h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {
        TimeHMS t1 = new TimeHMS(2, 50, 40);
        TimeHMS t2 = new TimeHMS(1, 20, 30);

        TimeHMS result = t1.add(t2);
        result.display();
    }
}
```
<img width="377" height="26" alt="image" src="https://github.com/user-attachments/assets/7d241270-7318-463f-911f-26c0b39dffce" />


## assi-4
```
class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    TimeHM add(TimeHM t) {
        int min = this.m + t.m;
        int hr = this.h + t.h + (min / 60);

        min = min % 60;

        return new TimeHM(hr, min);
    }

    void display() {
        System.out.println(h + " hours " + m + " minutes");
    }

    public static void main(String[] args) {
        TimeHM t1 = new TimeHM(2, 45);
        TimeHM t2 = new TimeHM(1, 30);

        TimeHM result = t1.add(t2);
        result.display();
    }
}
```
<img width="394" height="23" alt="image" src="https://github.com/user-attachments/assets/9f21ce7c-20ca-4c50-ae76-bb8790a6e569" />


## assi-5
```
FACTORIAL
class Factorial {
    public static void main(String[] args) {
        int n = 5, fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("Factorial = " + fact);
    }
}
```
<img width="367" height="17" alt="image" src="https://github.com/user-attachments/assets/0183eaf8-7cd9-45e1-a187-38e3d664409d" />

ARMSTRONG
class Armstrong {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}

<img width="381" height="17" alt="image" src="https://github.com/user-attachments/assets/e15fc7d7-2b1c-4e70-bb08-412bdc8c0a61" />

PALINDROME
class Palindrome {
    public static void main(String[] args) {
        int n = 121, temp = n, rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        if (rev == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

<img width="377" height="19" alt="image" src="https://github.com/user-attachments/assets/fbde58a4-5737-4d1a-b150-8b66aca7a4a8" />

FIBONACCI
class Fibonacci {
    public static void main(String[] args) {
        int n = 5, a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

<img width="408" height="16" alt="image" src="https://github.com/user-attachments/assets/0876f995-a558-41e9-823b-9e67b54605e7" />

PATTERN
class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

<img width="426" height="71" alt="image" src="https://github.com/user-attachments/assets/21eadd8e-216e-4159-8e7b-bea733314861" />


## assi-6
```
class Array1D {
    int arr[] = {1, 2, 3, 4, 5};

    void output1() {
        System.out.print("Array: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    void output2() {
        System.out.print("Reverse Print: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void reverse() {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("Reversed Array: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Array1D obj = new Array1D();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}
```
<img width="377" height="44" alt="image" src="https://github.com/user-attachments/assets/f14e33ce-991c-4dad-8706-4097d3faea84" />


## assi-7
```
class Matrix {
    int a[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int b[][] = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1}
    };

    void addition() {
        System.out.println("Addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    void rowSum() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += a[i][j];
            System.out.println("Row " + i + " Sum = " + sum);
        }
    }

    void colSum() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += a[j][i];
            System.out.println("Column " + i + " Sum = " + sum);
        }
    }

    void diagonalSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++)
            sum += a[i][i];

        System.out.println("Diagonal Sum = " + sum);
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        obj.addition();
        obj.transpose();
        obj.rowSum();
        obj.colSum();
        obj.diagonalSum();
    }
}
```
<img width="398" height="283" alt="image" src="https://github.com/user-attachments/assets/99d08a5c-55d0-43eb-a96d-ecf78d6e78d6" />

## assi-8
```
class WithoutThread {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {
        WithoutThread obj = new WithoutThread();

        obj.print();
        obj.print();
        obj.print();
    }
}
```
<img width="395" height="73" alt="image" src="https://github.com/user-attachments/assets/7bb1220a-e3e0-49c7-9439-74cc6d2326dd" />

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}

<img width="394" height="92" alt="image" src="https://github.com/user-attachments/assets/72e55d23-d78f-42d5-abae-b3648408aee2" />


## assi-9
```
class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {
        try {
            JoinExample t1 = new JoinExample();
            JoinExample t2 = new JoinExample();
            JoinExample t3 = new JoinExample();

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="397" height="182" alt="image" src="https://github.com/user-attachments/assets/88bac8fb-2ea3-42e8-b576-c070152f5487" />

## assi-10
```
package mypack;

public class A { public void show(){System.out.println("Class A");}}
class B { void show(){System.out.println("Class B");}}
class C { void show(){System.out.println("Class C");}}
class D { void show(){System.out.println("Class D");}}
class E { void show(){System.out.println("Class E");}}

import mypack.A;

class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
```
<img width="405" height="20" alt="image" src="https://github.com/user-attachments/assets/ac0ac372-df04-4cb4-8d33-2823bf2149e1" />


## assi-11
```
package pack1;

public class A {
    public void show() {
        System.out.println("Parent Package");
    }
}package pack1.subpack;

public class B {
    public void show() {
        System.out.println("Sub Package");
    }
}
import pack1.A;
import pack1.subpack.B;

class Test {
    public static void main(String[] args) {
        new A().show();
        new B().show();
    }
}
```
<img width="420" height="29" alt="image" src="https://github.com/user-attachments/assets/18c8c2bf-2d7d-47b4-875e-de1cdab7863d" />


## assi-12
```
class ExceptionDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }

        try {
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error!");
        }
    }
}
```
<img width="451" height="69" alt="image" src="https://github.com/user-attachments/assets/167d1c3d-9734-4bed-bc5e-02d365972825" />

## assi-13
```
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class TestAge {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("age is not in valid range (18-25)");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
```

<img width="482" height="81" alt="image" src="https://github.com/user-attachments/assets/6f649f1b-d666-4921-af53-0ecd96c3f4dd" />

## assi-14
```
abstract class Animal {
    abstract void sound();
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    void sound() {
        System.out.println("Bark");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.play();
    }
}
```

<img width="424" height="31" alt="image" src="https://github.com/user-attachments/assets/a9c9df58-d178-4e59-a5bb-545ffd38e588" />


## assi-15
```
import javax.swing.*;
import java.awt.event.*;

public class AddSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b = new JButton("Add");

        t1.setBounds(50, 50, 150, 30);
        t2.setBounds(50, 100, 150, 30);
        t3.setBounds(50, 150, 150, 30);
        b.setBounds(50, 200, 150, 30);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int c = a + b;
                    t3.setText(String.valueOf(c));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f, "Enter valid numbers!");
                }
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
```
<img width="482" height="362" alt="image" src="https://github.com/user-attachments/assets/c45d7849-d8ef-49e6-8b22-e4d4d47abfd7" />

## assi-16
```
import javax.swing.*;
import java.awt.event.*;

public class CalculatorSwing implements ActionListener {
    JFrame f;
    JTextField t;
    int num1, num2, result;
    char op;

    CalculatorSwing() {
        f = new JFrame("Calculator");
        t = new JTextField();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton eq = new JButton("=");

        t.setBounds(50, 50, 220, 30);
        b1.setBounds(50, 100, 50, 50);
        b2.setBounds(110, 100, 50, 50);
        add.setBounds(170, 100, 50, 50);
        sub.setBounds(230, 100, 50, 50);
        mul.setBounds(50, 160, 50, 50);
        div.setBounds(110, 160, 50, 50);
        eq.setBounds(170, 160, 110, 50);

        f.add(t); f.add(b1); f.add(b2);
        f.add(add); f.add(sub); f.add(mul); f.add(div); f.add(eq);

        b1.addActionListener(this);
        b2.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.matches("[0-9]")) {
            t.setText(t.getText() + s);
        } else if (s.matches("[+\\-*/]")) {
            num1 = Integer.parseInt(t.getText());
            op = s.charAt(0);
            t.setText("");
        } else if (s.equals("=")) {
            num2 = Integer.parseInt(t.getText());

            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            t.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }
}
```
<img width="470" height="357" alt="image" src="https://github.com/user-attachments/assets/6f877c65-e8f8-47a3-a60d-900c6cae8c6e" />
<img width="470" height="342" alt="image" src="https://github.com/user-attachments/assets/8feb3851-aa4b-413b-9f56-837656e9e952" />
<img width="478" height="361" alt="image" src="https://github.com/user-attachments/assets/66657996-830b-4345-8ab5-41c4a927d644" />
<img width="470" height="365" alt="image" src="https://github.com/user-attachments/assets/f14a8e1d-7b2d-4672-8931-bcbec35d021d" />


## assi-17
```
import javax.swing.*;

public class MatrixAddSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Addition");

        JTextField[][] a = new JTextField[2][2];
        JTextField[][] b = new JTextField[2][2];
        JTextField[][] c = new JTextField[2][2];

        JButton btn = new JButton("Add");

        int x = 50, y = 50;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = new JTextField();
                b[i][j] = new JTextField();
                c[i][j] = new JTextField();

                a[i][j].setBounds(x + j * 40, y + i * 40, 40, 30);
                b[i][j].setBounds(x + 120 + j * 40, y + i * 40, 40, 30);
                c[i][j].setBounds(x + 240 + j * 40, y + i * 40, 40, 30);

                f.add(a[i][j]);
                f.add(b[i][j]);
                f.add(c[i][j]);
            }
        }

        btn.setBounds(120, 150, 80, 30);

        btn.addActionListener(e -> {
            try {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        int val = Integer.parseInt(a[i][j].getText()) +
                                  Integer.parseInt(b[i][j].getText());
                        c[i][j].setText(String.valueOf(val));
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Invalid Input!");
            }
        });

        f.add(btn);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
```
<img width="615" height="350" alt="image" src="https://github.com/user-attachments/assets/9c04e683-6470-4785-83ce-5810db2b04c1" />

## assi-18
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapesFrame extends JFrame implements ActionListener {
    String shape = "";

    ShapesFrame() {
        setLayout(new FlowLayout());

        String[] shapes = {"Circle","Oval","Rectangle","Square","Line","Arc","RoundRect","Ellipse","Triangle","Point"};

        for (String s : shapes) {
            JButton b = new JButton(s);
            b.addActionListener(this);
            add(b);
        }

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (shape.equals("Circle")) g.drawOval(200, 200, 100, 100);
        if (shape.equals("Rectangle")) g.drawRect(200, 200, 120, 60);
        if (shape.equals("Line")) g.drawLine(100, 100, 300, 300);
        if (shape.equals("Oval")) g.drawOval(200, 200, 120, 80);
    }

    public static void main(String[] args) {
        new ShapesFrame();
    }
}

```
<img width="551" height="361" alt="image" src="https://github.com/user-attachments/assets/0518a197-0201-44d8-8e32-c46694f1bd93" />
<img width="556" height="369" alt="image" src="https://github.com/user-attachments/assets/a083e80b-a5db-48bc-a6f8-23f07e3a758d" />
<img width="559" height="354" alt="image" src="https://github.com/user-attachments/assets/a7f10082-cdfe-472a-8223-9c9da5cc0cc8" />
<img width="550" height="356" alt="image" src="https://github.com/user-attachments/assets/e9cb3524-4eb7-4ddd-af1f-3189ac54377a" />
<img width="593" height="388" alt="image" src="https://github.com/user-attachments/assets/e0ebf6dc-ae63-4c9f-b251-3ab14596dccc" />
<img width="588" height="388" alt="image" src="https://github.com/user-attachments/assets/77d06bc3-0443-40a2-9581-e5d5de78a7ac" />
<img width="593" height="385" alt="image" src="https://github.com/user-attachments/assets/9060d2ff-5242-486a-b80d-528dceb6cbaa" />
<img width="595" height="395" alt="image" src="https://github.com/user-attachments/assets/c7b63bb5-1d95-44b4-8156-0a3bdfac850c" />
<img width="589" height="389" alt="image" src="https://github.com/user-attachments/assets/1d175dbe-6a6f-40da-8f13-24ba9d9c87f8" />
<img width="431" height="286" alt="image" src="https://github.com/user-attachments/assets/065c6ae6-399e-4fa4-8e2b-0cad42ecc8cd" />


## assi-19
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintApp extends JFrame {
    Color currentColor = Color.BLACK;
    int size = 5;

    PaintApp() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(currentColor);
                g.fillOval(e.getX(), e.getY(), size, size);
            }
        });

        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton big = new JButton("Big");

        red.setBounds(10, 10, 80, 30);
        blue.setBounds(100, 10, 80, 30);
        big.setBounds(190, 10, 80, 30);

        red.addActionListener(e -> currentColor = Color.RED);
        blue.addActionListener(e -> currentColor = Color.BLUE);
        big.addActionListener(e -> size = 15);

        setLayout(null);
        add(red); add(blue); add(big);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}
```
<img width="556" height="365" alt="image" src="https://github.com/user-attachments/assets/1eccd2ec-8660-4e1c-a180-17e7d7d03618" />

## assi-20
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

    JTextField nameField, ageField, cityField, emailField, phoneField, countryField;
    JPasswordField passwordField;
    JComboBox<String> courseBox;
    JRadioButton male, female;
    JButton submit;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 500);
        setLayout(new GridLayout(10, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        nameField = new JTextField();
        ageField = new JTextField();
        passwordField = new JPasswordField();
        cityField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();
        countryField = new JTextField();

        String[] courses = {"BTech", "BCA", "MCA"};
        courseBox = new JComboBox<>(courses);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        submit = new JButton("Submit");

        // Adding Components
        add(new JLabel("Name:")); add(nameField);
        add(new JLabel("Age:")); add(ageField);
        add(new JLabel("Password:")); add(passwordField);
        add(new JLabel("City:")); add(cityField);
        add(new JLabel("Email ID:")); add(emailField);
        add(new JLabel("Phone No:")); add(phoneField);
        add(new JLabel("Country:")); add(countryField);
        add(new JLabel("Course:")); add(courseBox);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("")); // empty space
        add(submit);

        // Button Action
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String password = new String(passwordField.getPassword());
                String city = cityField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String country = countryField.getText();
                String course = (String) courseBox.getSelectedItem();

                String gender = "";
                if (male.isSelected()) gender = "Male";
                else if (female.isSelected()) gender = "Female";

                JOptionPane.showMessageDialog(null,
                        "Name: " + name +
                        "\nAge: " + age +
                        "\nPassword: " + password +
                        "\nCity: " + city +
                        "\nEmail: " + email +
                        "\nPhone: " + phone +
                        "\nCountry: " + country +
                        "\nCourse: " + course +
                        "\nGender: " + gender
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
        
```
<img width="218" height="329" alt="image" src="https://github.com/user-attachments/assets/e71c2e46-a511-4509-babe-5dc33cae5c09" />


## assi-21(CHAR BY CHAR)
```
import java.io.*;

public class CharFileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest_char.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using character stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
input
<img width="494" height="29" alt="image" src="https://github.com/user-attachments/assets/cae1dc5d-d0a3-4a51-a6a2-2d901c009529" />
output
<img width="498" height="17" alt="image" src="https://github.com/user-attachments/assets/8e30329c-69bd-4319-b23c-4328e7dd3729" />

## assi-22(BYTE BY BYTE)
```
import java.io.*;

public class ByteFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest_byte.txt");

            int b;

            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("File copied using byte stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
input
<img width="484" height="31" alt="image" src="https://github.com/user-attachments/assets/4857eb26-627e-4952-ae53-f43528c865bf" />

output
<img width="512" height="20" alt="image" src="https://github.com/user-attachments/assets/9648d48b-2993-4835-bb6a-5d876720b316" />










