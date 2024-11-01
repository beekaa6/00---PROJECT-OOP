package com.beka;

import java.util.HashMap;

public class HelpCommand implements Command{
  private HashMap<String, String> commands;

  public HelpCommand() {
    this.commands = new HashMap<>();
    this.commands.put("monthly_total", "Returns the sum of both the export and import for a specified month of a specified year");
    this.commands.put("monthly_average", "Returns the average of both the export and import of a specified month of a specified year");
    this.commands.put("yearly_total", "Provides an overview of all the monthly totals for a particular year. This command returns the total of each month for both import and export and then gives the yearly total for both import and export");
    this.commands.put("yearly_average", "Provides an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export");
    this.commands.put("overview", "Returns all the unique values that span the data set: years, countries, commodities, transportation modes, and measures");
  }

  public void execute(){
    System.out.println("Available commands: ");
    System.out.println("");
    System.out.println("help: Returns a list of available commands");
    System.out.println("help \"command\": Provides a full explanation of \"command\"");
    System.out.println("monthly_total: Returns the sum of both the export and import");
    System.out.println("monthly_average: Returns the average of both the export and import");
    System.out.println("yearly_total: Provides an overview of all the monthly totals");
    System.out.println("yearly_average: Provides an overview of all the monthly averages");
    System.out.println("overview: Returns all the unique values");
    System.out.println("end: to stop");
    System.out.println("");
  }

  public String returnCommand(String key){
    if (this.commands.get(key) == null) {
      return "You must give valid command, type 'help' to see all commands";
    } else {
      return this.commands.get(key);
    }
  }
  
  public void requiredParameters(String commandItSelf){
    System.out.println("The command "+commandItSelf+" have the following parameters available to customize their query:");
    System.out.println("country (default: \"all\")");
    System.out.println("commodity (default: \"all\")");
    System.out.println("transport_mode (default: \"all\")");
    System.out.println("measure (default: \"$\")");
    System.out.println();
  }
  
}
