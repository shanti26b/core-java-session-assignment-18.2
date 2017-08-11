// here i am showing to create a class HDTV

package comporator;     // here i have taken package name as comporator

import java.util.Comparator;

public class HDTV {     // here i am taking class name as HDTV
	private int sizeNumber;     // here i am taking two variables  sizeNumber of int type  String brands of String type
private String brands;

public HDTV(int size, String brands) {
	this.sizeNumber = sizeNumber;
	this.brands = brands;
}

public int getSize() {      // i am taking get or size method
	return sizeNumber;
}

public void setSize(int size) {  // here i am creating set size method
	this.sizeNumber = sizeNumber;
}

public String getBrand() {    // taking the getBrand name with default parameters
	return brands;
}

public void setBrand(String brands) {  // taking set of main method
	this.brands = brands;
}

public String toString(){
	return sizeNumber+brands;
	}
}

  class SizeComparator implements Comparator<HDTV> {
	      
public  int compare(HDTV tv1,HDTV tv2) {
	 int tv1SizeNumber = tv1.getSize();
		int tv2SizeNumber = tv2.getSize();

		if (tv1SizeNumber > tv2SizeNumber){  // i am creating if loop which checks the conditions
				
		return 1;}
	
	else{
		return 0;
}
}}


