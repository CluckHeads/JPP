package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: EmployeeInfo
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       will allow the user to input their full name and then create a
                user id of their first initial and surname
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  public EmployeeInfo() {
    setName();
  }

  public StringBuilder getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  private void setName(){
    String nameString = inputName();
    name = new StringBuilder(nameString);

  }

  private void createEmployeeCode(StringBuilder name){
    if (checkName(name)) { //valid and contains space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "guest";
    }

  }

  private String inputName(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your first and last name: ");
    String nameString = scanner.nextLine();

    return nameString;
  }

  private boolean checkName(StringBuilder name){
    if (name.indexOf(" ") != -1) {
      return true;
    } else {
      return false;
    }
  }


}
