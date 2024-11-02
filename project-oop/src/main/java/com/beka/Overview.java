package com.beka;

import java.util.Set;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.HashSet;

public class Overview {
  private Set<String> uniqueDirection;
  private Set<String> uniqueDate;
  private Set<String> uniqueCountry;
  private Set<String> uniqueCommodity;
  private Set<String> uniqueTransportMode;
  private Set<String> uniqueMeasure;
  private Set<String> uniqueValue;

  public Overview() {
    this.uniqueDirection = new HashSet<>();
    this.uniqueDate = new HashSet<>();
    this.uniqueCountry = new HashSet<>();
    this.uniqueCommodity = new HashSet<>();
    this.uniqueTransportMode = new HashSet<>();
    this.uniqueMeasure = new HashSet<>();
    this.uniqueValue = new HashSet<>();
  }

  public void startOverview(){
    try (CSVReader reader = new CSVReader(new FileReader("covid_and_trade.csv"))) {
      reader.readNext();
      String[] line;
      while ((line = reader.readNext()) != null) {
          this.uniqueDirection.add(line[0]);
          this.uniqueDate.add(line[2]);
          this.uniqueCountry.add(line[4]);
          this.uniqueCommodity.add(line[5]);
          this.uniqueTransportMode.add(line[6]);
          this.uniqueMeasure.add(line[7]);
          this.uniqueValue.add(line[8]);
      }
    } catch (Exception e) {
      System.out.println("Error: "+e.getMessage());
    }
  }

  public void displayOverview() {
    System.out.println("Unique Directions: " + uniqueDirection);
    System.out.println("Unique Dates: " + uniqueDate);
    System.out.println("Unique Countries: " + uniqueCountry);
    System.out.println("Unique Commodities: " + uniqueCommodity);
    System.out.println("Unique Transport Modes: " + uniqueTransportMode);
    System.out.println("Unique Measures: " + uniqueMeasure);
    System.out.println("Unique Values: " + uniqueValue);
  }

}
