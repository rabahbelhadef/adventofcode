package advetofcode._2017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class Day4 {

    public int part1(List<String> input) {
        return (int) input.stream().map(s -> Arrays.stream(s.split(" ")).collect(toList()))
                .filter(list -> list.stream().distinct().count() == list.size()).count() ;
    }

    public int part2(List<String> input) {
        return (int) input.stream().map(s -> Arrays.stream(s.split(" ")).collect(toList()))
                .filter(list -> list.stream().filter(distinctAnagram()).count() == list.size()).count() ;
    }

    private Predicate<? super String> distinctAnagram() {
        Set<String> anagram = new HashSet<>();
        return s -> anagram.add(s.chars().sorted().boxed().map(c -> c.toString()).collect(Collectors.joining()) );
    }

}
