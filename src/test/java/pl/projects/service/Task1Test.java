package pl.projects.service;

import org.junit.jupiter.api.Test;
import pl.projects.model.Task1Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void testGetResponse1(){
        Task1 task1 = new Task1();
        List<Integer> input = List.of(1 ,10, 20, 20, 2, 5);
        Task1Response response = (Task1Response) task1.getResponse(input);
        assertEquals(Arrays.asList(1,2,5,10,20), response.getList());
        assertEquals(6,response.getCount());
        assertEquals(5,response.getDistinct());
        assertEquals(20,response.getMax());
        assertEquals(1,response.getMin());
    }

    @Test
    public void testGetResponseSingleNumber() {
        Task1 task1 = new Task1();
        List<Integer> input = List.of(13);
        Task1Response response = (Task1Response) task1.getResponse(input);
        assertEquals(List.of(13), response.getList());
        assertEquals(1, response.getCount());
        assertEquals(1, response.getDistinct());
        assertEquals(13, response.getMax());
        assertEquals(13, response.getMin());
    }

    @Test
    public void testGetResponseNegativeNumbers() {
        Task1 task1 = new Task1();
        List<Integer> input = Arrays.asList(-5, -10, -3, -1, -10, -3);
        Task1Response response = (Task1Response) task1.getResponse(input);
        assertEquals(Arrays.asList(-10, -5, -3, -1), response.getList());
        assertEquals(6, response.getCount());
        assertEquals(4, response.getDistinct());
        assertEquals(-1, response.getMax());
        assertEquals(-10, response.getMin());
    }
}