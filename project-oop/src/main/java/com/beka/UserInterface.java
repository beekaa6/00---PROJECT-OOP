package com.beka;

import java.util.Scanner;

public class UserInterface {
  
  public void startApp(){
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter command: ");
      String input = scanner.nextLine();

      if (input.toLowerCase().equals("end") || input.isEmpty()) {
        System.out.println("Stopping");
        break;
      }

      String[] split = input.split("\\s+");

      if (input.toLowerCase().contains("help")) {
        HelpCommand help = new HelpCommand();
        if (split.length > 1) {
          System.out.println(help.returnCommand(split[1]).toLowerCase());
        } else {
          help.execute();
        }
      }

    }
  }
}
