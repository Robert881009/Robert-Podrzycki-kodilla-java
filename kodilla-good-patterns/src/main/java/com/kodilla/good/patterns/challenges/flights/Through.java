package com.kodilla.good.patterns.challenges.flights;

public class Through {
    private String through;

    public Through(String through) {
        this.through = through;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "Through{" +
                "through='" + through + '\'' +
                '}';
    }
}
