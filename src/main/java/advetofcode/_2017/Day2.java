package advetofcode._2017;

import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.min;


public class Day2 {

    public int part1(List<List<Integer>> input) {

        return input.stream()
                .map(list -> max(list) - min(list))
                .mapToInt(Integer::intValue).sum();
    }

}