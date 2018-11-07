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

import java.util.ArrayList;

public class Main {

  /**
   * Sets the Widgets and then prints out the information of that widget.
   *
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

  //Still needs work
  public static ArrayList<Product> testCollection() {
    AudioPlayer ap1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer mp1 = new MoviePlayer("Galaxy Tablet",
            new Screen("HD", 60, 30), MonitorType.LED);
    MoviePlayer mp2 = new MoviePlayer("iPad",
            new Screen("HD", 45, 60), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<Product>();

    products.add(ap1);
    products.add(mp1);
    products.add(ap2);
    products.add(mp2);

    return products;
  }

}



