import java.util.Scanner;

class PrintArr
{

  <E> void print(E a[]){
    
    for(E x : a) {

      System.out.print(x+" ");

    }
  
  }
  
  public static void main(String args[]){
    
    Scanner kb=new Scanner(System.in);

    PrintArr s = new PrintArr();
  
    System.out.println("Enter n  for Integer type array:");

    int n = kb.nextInt();

    Integer a[] = new Integer[n];

    System.out.println("Enter elements:");

    for(int i=0;i<n;i++) {

      a[i] = kb.nextInt();

    }

    s.print(a);
  
    System.out.println();

    System.out.println("Enter m for Double type array:");

    int m = kb.nextInt();

    Double b[] = new Double[m];

    System.out.println("Enter elements:");

    for(int i=0;i<m;i++) {

      b[i] = kb.nextDouble();

    }

    s.print(b);

    System.out.println();

  }

}