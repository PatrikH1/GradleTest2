package testTemplate;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SomeValuesTest {

    @Test
    public void getVarde() {
        SomeValues values1 = new SomeValues("Hej", 123L, 123.12F);

        String stringFromValues1 = SomeValues.getVarde("stringValue", values1);
        long longFromValues1 = SomeValues.getVarde("longValue", values1);
        float floatFromValues1 = SomeValues.getVarde("floatValue", values1);

        assertEquals(stringFromValues1, "Hej");
        assertEquals(longFromValues1, 123L);
        assertThat(floatFromValues1, is(123.12f));
    }
}