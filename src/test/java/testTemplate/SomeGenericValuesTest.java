package testTemplate;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SomeGenericValuesTest {

    @Test
    public void getVarde() {
        SomeGenericValues<String, Long, Float> valuesGeneric1 = new SomeGenericValues("Hej", 34L, 345.89F);

        String value1 = SomeGenericValues.getVarde("value1", valuesGeneric1);
        Long value2 = SomeGenericValues.getVarde("value2", valuesGeneric1);
        Float value3 = SomeGenericValues.getVarde("value3", valuesGeneric1);

        assertThat(value1, is("Hej"));
        assertThat(value2, is(34L));
        assertThat(value3, is(345.89F));
    }

}