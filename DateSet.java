import java.util.Scanner;

class str {

  String s;

  str(String s) {

    this.s = s;

  }

  String get() {

    return s;

  }

  String conversion() {

    String ss[] = s.split("/");

    int a;

    String n;

    if(ss[0].charAt(0) != '0') {

      a = Integer.parseInt(ss[0]);

    }
    
    else {

      a = Integer.parseInt(""+ss[0].charAt(1));

    }

    if(a == 1) {

      n = "" + a + "st ";

    }

    else if(a == 2) {

      n = "" + a + "nd ";

    }

    else if(a == 3) {

      n = "" + a + "rd ";

    }

    else {

      n = "" + a + "th ";

    }    

    if(ss[1].charAt(0) != '0') {

      a = Integer.parseInt(ss[1]);

    }
    
    else {

      a = Integer.parseInt(""+ss[1].charAt(1));

    }

    if(a == 1) {

      n = n + "January ";

    }

    else if(a == 2) {

      n = n + "February ";

    }

    else if(a == 3) {

      n = n + "March ";

    }

    else if(a == 4) {

      n = n + "April ";

    }

    else if(a == 5) {

      n = n + "May ";

    }

    else if(a == 6) {

      n = n + "June ";

    }

    else if(a == 7) {

      n = n + "July ";

    }

    else if(a == 8) {

      n = n + "August ";

    }

    else if(a == 9) {

      n = n + "September ";

    }

    else if(a == 10) {

      n = n + "October ";

    }

    else if(a == 11) {

      n = n + "November ";

    }

    else if(a == 12) {

      n = n + "December ";

    }

    n = n + ss[2];

    return n;
    
  }

}

class DateSet {
 
  public static void main(String args[]) {

    Scanner kb = new Scanner(System.in);

    System.out.println("Enter date:");

    str s = new str(kb.next());

    System.out.println(s.conversion());

  }

}