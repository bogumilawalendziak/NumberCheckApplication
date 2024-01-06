package pl.projects.service;

import pl.projects.model.Response;

import java.util.List;

public interface Task {
    public Response getResponse(List<Integer> list);
    default String getInputInfo() {
        return "Enter numbers list of integers separated by space and press enter to process.";
    }
}
