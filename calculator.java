public class Calculator {
  public static void main(String[] args)
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  add(a,b);
  sub(a,b);
  mul(a,b);
  div(a,b);
}
//addition
public static void add(int a ,int b){
  System.out.println("Addition :" + (a+b));
}
//subtraction
public static void sub(int a ,int b){
  System.out.println("Subtraction :" + (a-b));
}
//multiplication
public static void mul(int a ,int b){
  System.out.println("Multiplication :" + (a*b));
}
//division
public static void div(int a ,int b){
  System.out.println("Division :" + (a/b));
}

