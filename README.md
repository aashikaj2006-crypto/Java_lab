[ program -1  wap to calculate numbers using class and objects](# assi-1)

[ program -2  wap to add two distance in m,mm,cm](# assi-2)

[
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

<img width="377" height="26" alt="image" src="https://github.com/user-attachments/assets/7d241270-7318-463f-911f-26c0b39dffce" />

##assi-4
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

<img width="394" height="23" alt="image" src="https://github.com/user-attachments/assets/9f21ce7c-20ca-4c50-ae76-bb8790a6e569" />

##assi-5
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

<img width="398" height="283" alt="image" src="https://github.com/user-attachments/assets/99d08a5c-55d0-43eb-a96d-ecf78d6e78d6" />

