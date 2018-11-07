package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Interface:  MultimediaControl
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       contains the methods that every multimedia device will need to
                function
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public interface MultimediaControl {

  public void play();

  public void stop();

  public void previous();

  public void next();

}