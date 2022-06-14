package com.kodilla.good.patterns.challenges;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Titles {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> titles = movieStore.getMovies();
        String title = titles.entrySet().stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(title);
    }
}
