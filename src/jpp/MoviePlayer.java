package jpp;

public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  @Override
  public void play() {
    System.out.println("Playing.");
  }

  @Override
  public void stop() {
    System.out.println("Stopping.");
  }

  @Override
  public void previous() {
    System.out.println("Going to previous.");
  }

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
}
