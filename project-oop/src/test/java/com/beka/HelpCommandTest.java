package com.beka;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelpCommandTest {
  
  @Test
  public void testReturnCommandMonthlyTotal(){
    HelpCommand helpCommand = new HelpCommand();
    String result = helpCommand.returnCommand("monthly_total");

    assertEquals("Returns the sum of both the export and import for a specified month of a specified year", result);
  }

  @Test
  public void testReturnCommandMonthlyAverage(){
    HelpCommand helpCommand = new HelpCommand();
    String result = helpCommand.returnCommand("monthly_average");

    assertEquals("Returns the average of both the export and import of a specified month of a specified year", result);
  }

  @Test
  public void testReturnCommandYearlyTotal(){
    HelpCommand helpCommand = new HelpCommand();
    String result = helpCommand.returnCommand("yearly_total");

    assertEquals("Provides an overview of all the monthly totals for a particular year. This command returns the total of each month for both import and export and then gives the yearly total for both import and export", result);
  }

  @Test
  public void testReturnCommandYearlyAverage(){
    HelpCommand helpCommand = new HelpCommand();
    String result = helpCommand.returnCommand("yearly_average");

    assertEquals("Provides an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export", result);
  }

  @Test
  public void testReturnCommandOverview(){
    HelpCommand helpCommand = new HelpCommand();
    String result = helpCommand.returnCommand("overview");

    assertEquals("Returns all the unique values that span the data set: years, countries, commodities, transportation modes, and measures", result);
  }
}
