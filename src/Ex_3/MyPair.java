package Ex_3;

public class MyPair
{
    private final Integer key;
    private final String value;

    public MyPair(Integer aKey, String aValue)
    {
        key = aKey;
        value = aValue;
    }

    public Integer key()   { return key; }
    public String value() { return value; }

    @Override
    public String toString() {
        return value + ";" + key;
    }
}