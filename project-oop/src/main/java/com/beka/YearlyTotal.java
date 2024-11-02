package com.beka;

import java.util.Scanner;

public class YearlyTotal {
  public Long getYearlyTotal(TradeCSV readFile, Scanner scanner) {
    System.out.print("year (default: \"2015\"): ");
    String year = scanner.nextLine().trim();
    year = year.isEmpty() ? "2015" : year;
    while (Integer.parseInt(year) < 2015 || Integer.parseInt(year) > 2021) {
      System.out.println("year in number between 2015 - 2021");
      year = scanner.nextLine();
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
    
    return readFile.startReadingYearTotal(year, country, commodity, transport_mode, measure);
}

public double getYearlyAverage(TradeCSV readFile, Scanner scanner) {
  long totalSum = getYearlyTotal(readFile, scanner);
  return 1.0 * totalSum / readFile.getCount();
}
}
