package com.example.myapplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
//import static org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void power_test1 () {
        int expected = 308025;
        int actualValue = MainActivity.power(555,2);

        assertEquals(expected,actualValue);

    }


    @Test
    public void power_test2 () {
        int expected = 8;
        int actualValue = MainActivity.power(2,3);

        assertEquals(expected,actualValue);

    }

    @Test
    public void power_test3 () {
        int expected = 998001;
        int actualValue = MainActivity.power(999,2);

        assertEquals(expected,actualValue);

    }

static IntStream intProvider(){
    return IntStream.range(1,101);

}

@ParameterizedTest
@MethodSource("intProvider")
    void testWithProvider(Integer arg) {
        int expected=(int)Math.pow(2,arg);
        int actual=MainActivity.power(2,arg);
        assertEquals(expected,actual);

}

static Stream<Arguments> intProvider2(){
    return Stream.of(
        Arguments.of(1,1),
            Arguments.of(2,2),
            Arguments.of(3,3),
            Arguments.of(4,4),
            Arguments.of(5,5),
            Arguments.of(6,6),
            Arguments.of(7,7),
            Arguments.of(8,8),
            Arguments.of(9,9),
            Arguments.of(10,10)

    );

}
    @ParameterizedTest
    @MethodSource("intProvider2")
    void testWithProvider2(int a, int b) {
        int expected=(int)Math.pow(a,b);
        int actual=MainActivity.power(a,b);
        assertEquals(expected,actual);

    }

}
