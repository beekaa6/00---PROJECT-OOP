package com.beka;

import java.util.Scanner;

public class UserInterface {
  
  public void execute(){
    Scanner scanner = new Scanner(System.in);
    beginMessage();
    while (true) {
      System.out.print("Enter command: ");
      String input = scanner.nextLine();

      if (input.equals("end") || input.isEmpty()) {
        System.out.println("Stopping");
        break;
      }

    }
  }

  public void beginMessage(){
    System.out.println("Available commands: ");
    System.out.println("");
    System.out.println("help: Returns a list of available commands");
    System.out.println("help \"command\": Provides a full explanation of \"command\"");
    System.out.println("monthly_total: Returns the sum of both the export and import");
    System.out.println("monthly_average: Returns the average of both the export and import");
    System.out.println("yearly_total: Provides an overview of all the monthly totals");
    System.out.println("yearly_average: Provides an overview of all the monthly averages");
    System.out.println("overview: Returns all the unique values");
    System.out.println("end to stop");
    System.out.println("");
  }
}
