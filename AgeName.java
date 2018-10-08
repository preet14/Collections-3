import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
// A class to represent a student. 
class Student 
{ 
    int age; 
    String name; 
  
    // Constructor 
    public Student(int age, String name) 
    { 
        this.age = age; 
        this.name = name; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.age + " " + this.name; 
    } 
} 
  
class Sortbyage implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.age - b.age; 
    } 
} 
  
class Sortbyname implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Student a, Student b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 
  
// Driver class 
class AgeName
{ 
    public static void main (String[] args) 
    { 
        
	Scanner sc = new Scanner(System.in);
        ArrayList<Student> ar = new ArrayList<Student>(); 
        System.out.println("Enter Size : ");
        int n = Integer.parseInt(sc.next());
        for(int i=0;i<n;i++){
         System.out.println("Enter age followed by name of student");
        ar.add(new Student(Integer.parseInt(sc.next()), sc.next())); 
        }
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new Sortbyage()); 
  
        System.out.println("\nSorted by age"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new Sortbyname()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 
} 

