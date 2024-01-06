# NumberCheck Application

## Description
This Java console application consists of three tasks (Task1, Task2, Task3) designed to handle different types of inputs related to integer lists and graphs. Each task is a separate module that processes input data and generates specific output as defined in the task descriptions.

### Tasks Overview
1. **Task1**: Sorts a list of integers, returns distinct elements in ascending order, and provides basic statistics like count, distinct elements, minimum, and maximum values.
2. **Task2**: Finds pairs of numbers in a list that sum up to 13, displaying them in ascending order.
3. **Task3**: Identifies separated graphs in the input. It counts the number of separated graphs based on the input that defines connections between vertices.

## How to Use
- Run the `NumberCheckApplication` class as the entry point.
- Follow the on-screen instructions, inputting the number corresponding to the desired task or type 'exit' to quit.
- Input data according to the task requirements.

## Project Structure
- `NumberCheckApplication.java`: Main application class handling user input and task execution.
- `Task1.java`, `Task2.java`, `Task3.java`: Service classes implementing the respective tasks' functionalities.
- `Task1Response.java`, `Task2Response.java`, `Task3Response.java`: Model classes representing the response.

## Libraries and Dependencies
- The application uses `slf4j` for logging,
- Unit tests are implemented using `JUnit 5` for testing the Tasks functionality.

## Input/Output
- Inputs are read from the console (`System.in`) and outputs are displayed in the console (`Logger.info`).

## Tests
- Unit tests for Tasks functionality can be found in the `Task1Test.java`,`Task2Test.java` and `Task3Test.java` files.