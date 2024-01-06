package pl.projects.service;

import pl.projects.model.Task2Response;

import java.util.ArrayList;
import java.util.List;

public class Task2 implements Task {
    public Task2() {
    }

    public Task2Response getResponse(List<Integer> list) {
        List<String> pairs = new ArrayList<>();

        list.stream().sorted().forEach(v -> {
            list.stream()
                .filter(b -> (13 == (v + b)) && (v < b))
                .forEach(b -> pairs.add(v + " " + b));
        });

        return new Task2Response(pairs);
    }
}
