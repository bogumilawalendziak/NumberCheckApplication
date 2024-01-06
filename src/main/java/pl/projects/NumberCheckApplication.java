package pl.projects;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.projects.model.Response;
import pl.projects.service.Task;
import pl.projects.service.Task1;
import pl.projects.service.Task2;
import pl.projects.service.Task3;

public class NumberCheckApplication {

  public static final String CHOICE = "Enter your choice (1 for Task1, 2 for Task2, 3 for Task3, or 'exit' to quit):";
  private static final Logger logger = LoggerFactory.getLogger(NumberCheckApplication.class);
  private static Task3 task3;
  private static Task2 task2;
  private static Task1 task1;

  public static void main(String[] args) {
    init();

    Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

    String userInput;

    do {
      logger.info(CHOICE);
      userInput = scanner.nextLine();

      switch (userInput) {
        case "3":
          process(task3, scanner);
          break;
        case "2":
          process(task2, scanner);
          break;
        case "1":
          process(task1, scanner);
          break;
        default:
          logger.info("Please enter a valid input");
          break;
      }
    } while ("exit" != userInput);

  }

  private static void process(Task task, Scanner scanner) {
    logger.info(task.getInputInfo());
    String numbersInput = scanner.nextLine().trim();

    try {
      if (task instanceof Task3) {

        int i = Integer.parseInt(numbersInput);
        for (int j = 0; j < i; j++) {
          numbersInput += ' ' + scanner.nextLine();
        }
      }

      List<Integer> numbersList = getIntegerList(numbersInput);
      Response response = task.getResponse(numbersList);
      logger.info(response.toString());
    } catch (NumberFormatException e) {
      logger.error("Invalid number format.");
    } catch (Exception f) {
      logger.error("An unexpected error occurred. Please try again.", f);
    }
  }

  private static List<Integer> getIntegerList(String numbersInput) {
    return Arrays.stream(numbersInput.split("\\s+"))
        .filter(s -> !s.isEmpty())
        .map(Integer::valueOf)
        .collect(Collectors.toList());
  }

  private static void init() {
    task3 = new Task3();
    task2 = new Task2();
    task1 = new Task1();
  }
}