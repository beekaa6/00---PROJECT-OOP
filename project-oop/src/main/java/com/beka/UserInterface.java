package com.beka;

import java.util.Scanner;

public class UserInterface {
  
  public void startApp(){
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter command: ");
      String input = scanner.nextLine();
      String[] split = input.split("\\s+");

      if (input.equalsIgnoreCase("end")|| input.isEmpty()) {
        System.out.println("Stopping");
        break;
      } else if (input.toLowerCase().contains("help")) {
        HelpCommand help = new HelpCommand();
        if (split.length > 1) {
          System.out.println(help.returnCommand(split[1]));
          help.requiredParameters(split[1]);
        } else {
          help.execute();
        }
      } else if (input.toLowerCase().contains("monthly_total")) {
        MonthlyTotal monthlySum = new MonthlyTotal();
        System.out.println("Total sum for the month is: " + monthlySum.getMonthlyTotal(scanner));
      }

    }
  }
}
