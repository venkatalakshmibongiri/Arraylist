import java.util.*;
class Arraylist1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Size of Array ");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter elements in to Array ");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  ArrayList<Integer> al =new ArrayList<Integer>();
  for(int i=0;i<n;i++)
  {
   al.add(a[i]);
  } // System.out.println("Stack is "+al);
  Iterator <Integer> iter= al.iterator();		
  System.out.println("The iterator values");   
  while (iter.hasNext() )                                            
  {
  System.out.print(iter.next() + " ");                    
  }                                                             
 }
}

Output__________________________________________________________
Enter the Size of Array
5
Enter elements in to Array
10 20 30 40 50
The iterator values
10 20 30 40 50