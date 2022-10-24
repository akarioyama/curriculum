package chapter1;

public class HelloJava {

 private String message;
 public HelloJava() {
     message = "Hello, Java!";
 }
 public void print() {
     System.out.println(message);
 }
 public static void main(String[] args) {
     HelloJava hj = new HelloJava();
     hj.print();
 }
 }

