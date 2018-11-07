package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: MoviePlayer
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       class that will allow us to capture the details of an movie
                player
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public class MoviePlayer extends Product implements MultimediaControl, Comparable<Item> {
  // Fields
  private Screen screen;
  private MonitorType monitorType;

  // Default Constructor
  public MoviePlayer() {

  }

  //Overloaded Constructor
  public MoviePlayer(String n, Screen screen, MonitorType monitorType) {
    super(n);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  //Adds playing functionality
  @Override
  public void play() {
    System.out.println("Playing.");
  }

  //Adds stopping functionality
  @Override
  public void stop() {
    System.out.println("Stopping.");
  }

  //Adds previous functionality
  @Override
  public void previous() {
    System.out.println("Going to previous.");
  }

  //Adds skipping functionality
  @Override
  public void next() {
    System.out.println("Going to next.");
  }

  @Override
  public String toString() {
    super.toString();
    return "Monitor details: " + monitorType + "\n"
            + "Screen details: " + screen + "\n";
  }

  // Implementing the compareTo() method
  @Override
  public int compareTo(Item o) {
    return 0;
  }
}
