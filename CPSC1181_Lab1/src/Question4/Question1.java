package Question4;

import java.awt.Rectangle;
public class Question1 {
		public static void main(String[] args) 
		   { 
		      Rectangle r1 = new Rectangle(0, 0, 100, 50); 
		      Rectangle r2 = new Rectangle(0, 0, 100, 50);
		      r2.grow(10,  20);
		      System.out.println(r1); 
		      System.out.println(r2);
		   } 
}