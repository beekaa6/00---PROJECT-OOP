package com.beka;

import java.util.Scanner;

public class UserInterface {
  
  public void startApp(){
    MonthlyTotal monthlySum = new MonthlyTotal();
    YearlyTotal yearlySum = new YearlyTotal();
    TradeCSV readFile = new TradeCSV();
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
        System.out.println("Total sum for the month is: " + monthlySum.getMonthlyTotal(readFile, scanner));
      } else if (input.toLowerCase().contains("monthly_average")) {
        double result =monthlySum.getMonthlyAverage(readFile, scanner);
        System.out.println("Total average for the month is: " + result);
      } else if (input.toLowerCase().contains("yearly_total")) {
        System.out.println("Total sum for the year is: " + yearlySum.getYearlyTotal(readFile, scanner));
      } else if (input.toLowerCase().contains("yearly_average")) {
        double result =yearlySum.getYearlyAverage(readFile, scanner);
        System.out.println("Total average for the year is: " + result);
      } else if (input.toLowerCase().contains("overview")) {
        Overview overview = new Overview();
        overview.startOverview();
        overview.displayOverview();
      } else {
        System.out.println("Invalid command! Type help for more information");
      }
    }
  }
}
