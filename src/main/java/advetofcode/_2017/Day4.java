package advetofcode._2017;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Day4 {

    public int part1(List<String> input) {
        return (int) input.stream().map(s -> Arrays.stream(s.split(" ")).collect(toList()))
                .filter(list -> list.stream().distinct().count() == list.size()).count() ;
    }

}
