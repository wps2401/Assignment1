//William Schuhmann 1215016803
//CSE360 - Assignment 1
//10/7/2020

package cse360assignment02;

public class AddingMachine {
  
  public static void main(String[] args) {
	  AddingMachine adder = new AddingMachine();
	  adder.add(4);
	  adder.subtract(2);
	  System.out.println("Total: " + adder.getTotal());
	  System.out.println("History: " + adder.toString());
	}
  
  
  int total;
  StringBuffer history;
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new StringBuffer("0");
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = value + total;
	  history.append(" + " + value);
  }

  public void subtract (int value) {
	  total = total - value;
	  history.append(" - " + value);
  }

  public String toString () {
	  return history.toString();
  }

  public void clear() {
	  //Not detailed in assignment description.
  }
}
  



