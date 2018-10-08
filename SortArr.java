import java.util.Scanner;

class SortArr {

  <E extends Comparable> void sort(E a[]){
    
    E t;
    
    for(int i=1;i<a.length;i++){
   
      for(int j=0;j<a.length-i;j++){

        if(a[j+1].compareTo(a[j]) < 0) {

          t = a[j+1];
          
          a[j+1] = a[j];

          a[j] = t;

        } 
      
      } 
    
    }
  
  }
  
  public static void main(String args[]) throws Exception
{
    
    Scanner kb=new Scanner(System.in);

    SortArr s = new SortArr();
  
    System.out.println("Enter n for Integer array:");

    int n = kb.nextInt();

    Integer a[] = new Integer[n];

    System.out.println("Enter elements:");

    for(int i=0;i<n;i++) {

      a[i] = kb.nextInt();

    }

    s.sort(a);

    for(int i=0;i<n;i++) {

      System.out.print(a[i]+" ");

    } 
  
    System.out.println();

    System.out.println("Enter m for Double array:");

    int m = kb.nextInt();

    Double b[] = new Double[m];

    System.out.println("Enter elements:");

    for(int i=0;i<m;i++) {

      b[i] = kb.nextDouble();

    }

    s.sort(b);

    for(int i=0;i<m;i++) {

      System.out.print(b[i]+" ");

    } 
   
    System.out.println();

  }

}