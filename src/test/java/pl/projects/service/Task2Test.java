package pl.projects.service;


import org.junit.jupiter.api.Test;
import pl.projects.model.Task2Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    @Test
    public void testGetResponse1(){
        Task2 task2 = new Task2();
        List<Integer> input = List.of(0,2,6,7,9,10,12,13);
        Task2Response response = task2.getResponse(input);
        assertEquals(Arrays.asList("0 13","6 7"), response.getPairs());
    }

    @Test
    public void testGetResponse2(){
        Task2 task2 = new Task2();
        List<Integer> input = List.of(5, 8, 3, 4, 4, 9, 6, 7);
        Task2Response response = task2.getResponse(input);
        assertEquals(Arrays.asList("4 9", "4 9", "5 8", "6 7"), response.getPairs());
    }
    @Test
    public void testGetResponse3(){
        Task2 task2 = new Task2();
        List<Integer> input = List.of(13);
        Task2Response response = task2.getResponse(input);
        assertEquals(List.of(), response.getPairs());
    }

    @Test
    public void testGetResponse4(){
        Task2 task2 = new Task2();
        List<Integer> input = List.of(1,2 ,10 ,7 ,5 ,3, 6, 6, 13, 0);
        Task2Response response = task2.getResponse(input);
        assertEquals(Arrays.asList("0 13","3 10","6 7","6 7"), response.getPairs());
    }
}