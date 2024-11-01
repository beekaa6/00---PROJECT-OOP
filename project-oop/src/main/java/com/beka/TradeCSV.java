package com.beka;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class TradeCSV {
  
  public Long startReadingMonthly(String month, String country, String commodity, String transport_mode, String measure){
    try (CSVReader reader = new CSVReader(new FileReader("covid_and_trade.csv"))) {
      List<String[]> rows = reader.readAll();
      long totalSum = rows.stream()
      .filter(n -> {
        String date = n[2];
        String[] split = date.split("/");
        return (n[0].equals("Exports") || n[0].equals("Imports")) &&
              split[1].equals(month) &&
              n[4].equals(country) &&
              n[5].equals(commodity) &&
              n[6].equals(transport_mode) &&
              n[7].equals(measure);
      })
      .mapToLong(n -> Long.parseLong(n[8]))
      .sum();
    
      return totalSum;

    } catch (Exception e) {
      e.printStackTrace();
    }

    return (long) 0;
  }
}
