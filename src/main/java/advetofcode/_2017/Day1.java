package advetofcode._2017;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Day1 {

    private static IntFunction<Character> toChar = i -> (char) i;

    private static BiFunction<List<Integer>, Integer, Boolean> addFirst = (list, value) -> {
        list.add(0, value);
        return true;
    };

    public int part1(String input) {
        return (input + input.charAt(0)).chars().mapToObj(toChar).mapToInt(Character::getNumericValue)
                .filter(removeSingle(1)).sum();
    }

    public int part2(String input) {
        int modulo = (input.length()) / 2;
        return (input + input.substring(0, modulo)).chars()
                .mapToObj(toChar).mapToInt(Character::getNumericValue)
                .filter(removeSingle(modulo)).sum();
    }

    private IntPredicate removeSingle(int modulo) {
        List<Integer> last = IntStream.range(0, modulo).map(i -> Integer.MIN_VALUE).boxed().collect(Collectors.toList());
        return value -> value == last.get(modulo - 1) & addFirst.apply(last, value);
    }

}
