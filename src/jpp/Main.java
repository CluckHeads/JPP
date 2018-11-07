package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: Main
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Main class that allows the program to run
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public class Main {

  /**
   * Sets the Widgets and then prints out the information of that widget.
   * @param args - provides arguments for the String data type.
   */
  public static void main(String[] args) {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString() + "\n");
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString() + "\n");

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.type);
    }

  }

}


