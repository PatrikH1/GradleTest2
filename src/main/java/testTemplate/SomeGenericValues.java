package testTemplate;

import java.lang.reflect.Field;

public class SomeGenericValues<T1, T2, T3> {
    private T1 value1;
    private T2 value2;
    private T3 value3;

    public static <T> T getVarde(String faltnamn, SomeGenericValues someGenericValuesValues) {
        try {

            Field falt = someGenericValuesValues.getClass().getDeclaredField(faltnamn);
            falt.setAccessible(true);
            return (T) falt.get(someGenericValuesValues);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public SomeGenericValues(T1 value1, T2 value2, T3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

}
