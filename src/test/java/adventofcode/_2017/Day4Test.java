package adventofcode._2017;

import advetofcode._2017.Day4;
import io.vavr.control.Try;
import org.junit.Test;

import java.nio.file.Paths;

import static com.google.common.collect.Lists.newArrayList;
import static java.nio.file.Files.readAllLines;
import static org.assertj.core.api.Assertions.assertThat;

public class Day4Test {

    private final Day4 day4 = new Day4() ;

    @Test
    @SuppressWarnings("unchecked")
    public void part1(){
        assertThat(true).isTrue();
        assertThat(day4.part1(newArrayList(
                "aa bb cc dd ee" //
                ,"aa bb cc dd aa" //
                , "aa bb cc dd aaa"))) //
                .isEqualTo(2) ;

        assertThat(day4.part1(Try.of(() -> readAllLines(Paths.get("src/test/resources/day4.txt"))).get()))
                .isEqualTo(383) ;
        
    }

    @Test
    @SuppressWarnings("unchecked")
    public void part2(){
        assertThat(day4.part2(newArrayList(
                 "abcde fghij" //
                , "abcde xyz ecdab" //
                , "a ab abc abd abf abj"
                , "iiii oiii ooii oooi oooo"
                , "oiii ioii iioi iiio" ))) //
                .isEqualTo(3) ;

        assertThat(day4.part2(Try.of(() -> readAllLines(Paths.get("src/test/resources/day4.txt"))).get()))
                .isEqualTo(265) ;

    }



}
