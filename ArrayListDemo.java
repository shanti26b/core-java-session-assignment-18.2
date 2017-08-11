// here i am showing create another class having as ArrayList

package comporator;    // here i am creating  package name as comporator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo {      // i am taking class name as ArrayListDemo
	
	public static void main (String []args){     // the main method
		
			HDTV tv1 = new HDTV(90, "LG");       // here i am taking three objects of HDTV classes
			
			HDTV tv2 = new HDTV(45, "Sony");      // here i am taking HDTV string name as Sony
			
			HDTV tv3 = new HDTV(60, "Samsung");     // here i am taking HDTV string name as Samsung
			
			ArrayList<HDTV>arraylist = new ArrayList< HDTV>(); //  creating ArrayList in HDTV class
	        arraylist.add(tv1);
	        arraylist.add(tv2);    
	        arraylist.add(tv3);
	        
	        Collections.sort(arraylist, new SizeComparator());
	        
	               //here i am creating sort elements in the ArrayList
	         System.out.println("HDTV objects");
	       for (HDTV it : arraylist){   // here i am using for loop 
	            System.out.println(it.getBrand());   // sorted order
                                                     
	       }
		
		
	}

}
