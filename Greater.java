import java.util.Scanner;


public class Greater {  
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=10;
    System.out.println("enter a number");
    int a= sc.nextInt();
    if(num>a)
    {
        System.out.println("num is greater");
    }
    else{
        System.out.println("a is greater");
    }
    }
    
}
