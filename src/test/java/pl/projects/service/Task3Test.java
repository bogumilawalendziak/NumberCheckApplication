package pl.projects.service;

import org.junit.jupiter.api.Test;
import pl.projects.model.Task3Response;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task3Test {

    @Test
    public void test3Connections() {
        Task3 task3 = new Task3();
        List<Integer> input = List.of(5, 1, 2, 2, 10, 10, 11, 5, 6,14,15);
        Task3Response response = task3.getResponse(input);
        assertEquals(3, response.getGraphs().size());
    }

    @Test
    public void test2Connections() {
        Task3 task3 = new Task3();
        List<Integer> input = List.of(3, 1, 2, 2, 3, 4, 5);
        Task3Response response = task3.getResponse(input);
        assertEquals(2, response.getGraphs().size());
    }

    @Test
    public void testSingleConnections() {
        Task3 task3 = new Task3();
        List<Integer> input = List.of(1, 1, 2);
        Task3Response response = task3.getResponse(input);
        assertEquals(1, response.getGraphs().size());
    }

    @Test
    public void test0Connections() {
        Task3 task3 = new Task3();
        List<Integer> input = Collections.emptyList();
        Task3Response response = task3.getResponse(input);
        assertEquals(0, response.getGraphs().size());
    }

    @Test
    public void testNotValidInput() {
        Task3 task3 = new Task3();
        List<Integer> input = List.of(3, 1, 2);
        assertThrows(IllegalArgumentException.class,()->task3.getResponse(input));
    }
}