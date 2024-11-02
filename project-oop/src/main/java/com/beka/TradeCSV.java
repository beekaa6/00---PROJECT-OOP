package com.beka;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class TradeCSV {

  private int count;
  
  public Long startReadingMonthlyTotal(String month, String country, String commodity, String transport_mode, String measure){
    this.count = 0;
    try (CSVReader reader = new CSVReader(new FileReader("covid_and_trade.csv"))) {
      List<String[]> rows = reader.readAll();
      long totalSum = rows.stream()
      .filter(n -> {
        String date = n[2];
        String[] split = date.split("/");
        if ((n[0].equals("Exports") || n[0].equals("Imports")) &&
              split[1].equals(month) &&
              n[4].equals(country) &&
              n[5].equals(commodity) &&
              n[6].equals(transport_mode) &&
              n[7].equals(measure)){
                count++;
                return true;
              };
        return false;
      })
      .mapToLong(n -> Long.parseLong(n[8]))
      .sum();
    
      return totalSum;

    } catch (Exception e) {
      e.printStackTrace();
    }

    return (long) 0;
  }
  
  public Long startReadingYearTotal(String year, String country, String commodity, String transport_mode, String measure){
    this.count = 0;
    try (CSVReader reader = new CSVReader(new FileReader("covid_and_trade.csv"))) {
      List<String[]> rows = reader.readAll();
      long totalSum = rows.stream()
      .filter(n -> {
        if ((n[0].equals("Exports") || n[0].equals("Imports")) &&
              Integer.parseInt(n[1]) == Integer.parseInt(year) &&
              n[4].equals(country) &&
              n[5].equals(commodity) &&
              n[6].equals(transport_mode) &&
              n[7].equals(measure)){
                count++;
                return true;
              };
        return false;
      })
      .mapToLong(n -> Long.parseLong(n[8]))
      .sum();
    
      return totalSum;

    } catch (Exception e) {
      e.printStackTrace();
    }

    return (long) 0;
  }
  
  public int getCount() {
    return count;
  }
}
