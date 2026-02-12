import java.util.Scanner;
public class nested_if_else {
  public static void main(String[] args) {
    
  
  Scanner obj = new Scanner(System.in);
  System.out.print("write your first number = ");
  int a = obj.nextInt();
  System.out.print("write your second number = ");
  int b = obj.nextInt();
  System.out.print("write your third number = ");
  int c = obj.nextInt();
  if(a>b){
    if(b>c){
      System.out.println("max number is = "+a);
    }
  }
  else{
    if(b>c){
      System.out.println("max number = "+b);

    }
    else{
      System.out.println("max number is = "+c);
    }
  }

  obj.close();
  }
}
