package test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class JUnitTestClass {
    static String[] COUNTRY_NAMES
            = { "China", "Australia", "India", "USA", "USSR", "UK", "China",
            "France", "Poland", "Austria", "India", "USA", "Egypt", "China" };


    private static class MutableInteger{
        int count = 0;

        public void increment(){ this.count++; }

        public int getCount() { return count; }

    }

    @Test
    public void testMapWithMutableIntegerCounter(){
        Map<String, MutableInteger> counterMap = new HashMap<>();

        counterWithMutableInteger(counterMap);

        assertEquals(3, counterMap.get("China").getCount());
        assertEquals(2, counterMap.get("India").getCount());
    }
    private void counterWithMutableInteger(Map<String, MutableInteger> counterMap){
        for(String country: COUNTRY_NAMES){
            counterMap.compute(country, (k, v) -> v == null ? new MutableInteger() : v).increment();
        }
    }




}
