package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: AudioPlayer
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       class that will allow us to capture the details of an audio
                player
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

/**
 * A concrete class that will allow us to capture the details of an audio player.
 */
public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * constructor that will take in 2 parameters.
   *
   * @param n                   - String - used to name the audio player.
   * @param audioSpecifications - String that will allow the user to specify
   *                            the audio specifications.
   */
  public AudioPlayer(String n, String audioSpecifications) {
    super(n);
    mediaType = ItemType.AUDIO;
    this.audioSpecification = audioSpecifications;
  }

  /**
   * Method that notifies you that the media device is playing.
   */
  @Override
  public void play() {
    System.out.println("Playing.");
  }

  /**
   * Method that notifies you that the media device is stopping.
   */
  @Override
  public void stop() {
    System.out.println("Stopping.");
  }

  /**
   * Method that notifies you that the media device is going to the previous song.
   */
  @Override
  public void previous() {
    System.out.println("Going to previous song.");
  }

  /**
   * Method that notifies you that the media device is going to the next song.
   */
  @Override
  public void next() {
    System.out.println("Going to next song.");
  }

  @Override
  public String toString() {
    System.out.println(super.toString());
    return "Audio Spec : " + audioSpecification + "\n"
            + "Type : " + mediaType + "\n";
  }

}

