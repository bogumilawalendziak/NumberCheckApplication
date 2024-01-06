package pl.projects.service;

import pl.projects.model.Response;
import pl.projects.model.Task1Response;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 implements Task {

    public Task1() {
    }

    public Response getResponse(List<Integer> list) {

        list = list.stream().sorted().collect(Collectors.toList());

        return new Task1Response(list.stream().distinct().collect(Collectors.toList()), list.size(), list.stream().distinct().count(), list.get(0), list.get(list.size() - 1));
    }

}
