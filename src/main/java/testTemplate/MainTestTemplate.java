package testTemplate;

public class MainTestTemplate {

    public static void main(String... args) {
        SomeValues values1 = new SomeValues("Hej", 123L, 123.12F);

        String stringFromValues1 = SomeValues.getVarde("stringValue", values1);
        Long longFromValues1 = SomeValues.getVarde("longValue", values1);
        Float floatFromValues1 = SomeValues.getVarde("floatValue", values1);

        System.out.println("Value of String: " + stringFromValues1);
        System.out.println("Value of Long: " + longFromValues1);
        System.out.println("Value of Float: " + longFromValues1);

        // Test of the class SomeGenericValues
        SomeGenericValues<String, Long, Float> valuesGeneric1 = new SomeGenericValues("Hej", 34L, 345.89F);

        String value1 = SomeGenericValues.getVarde("value1", valuesGeneric1);
        Long value2 = SomeGenericValues.getVarde("value2", valuesGeneric1);
        Float value3 = SomeGenericValues.getVarde("value3", valuesGeneric1);

        System.out.println("Value of String: " + value1);
        System.out.println("Value of Long: " + value2);
        System.out.println("Value of Float: " + value3);


    }

}
