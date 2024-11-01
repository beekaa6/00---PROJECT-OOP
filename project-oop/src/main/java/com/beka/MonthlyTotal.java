package com.beka;

import java.util.Scanner;

public class MonthlyTotal {
  
  public Long getMonthlyTotal(Scanner scanner) {
    TradeCSV readFile = new TradeCSV();

      System.out.print("month (default: \"01\"): ");
      String month = scanner.nextLine();
      month = month.isEmpty() ? "01" : month;
      while (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
        System.out.println("month in number between 01 - 12");
        month = scanner.nextLine();
      }
      if (month.length() == 1) {
        month = "0" + month;
      }
      System.out.print("country (default: \"all\"): ");
      String country = scanner.nextLine();
      country = country.isEmpty() ? "All" : country;
      System.out.print("commodity (default: \"all\"): ");
      String commodity = scanner.nextLine();
      commodity = commodity.isEmpty() ? "All" : commodity;
      System.out.print("transport_mode (default: \"all\"): ");
      String transport_mode = scanner.nextLine();
      transport_mode = transport_mode.isEmpty() ? "All" : transport_mode;
      System.out.print("measure (default: \"$\"): ");
      String measure = scanner.nextLine();
      measure = measure.isEmpty() ? "$" : measure;
      System.out.println();
      
      return readFile.startReadingMonthly(month, country, commodity, transport_mode, measure);
  }
}
