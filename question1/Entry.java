
/**
 * Represents an entry in a key-value pair.
 */
public class Entry
{
    private int key;
    private int value;

    /**
     * Constructs an entry with the specified key and value.
     * 
     * @param key the key of the entry
     * @param value the value of the entry
     */

    public Entry(int key, int value)
    {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the key associated with this entry.
     *
     * @return the key associated with this entry
     */

    public int getKey()
    {
        return key;
    }

    /**
     * Returns the value associated with this entry.
     *
     * @return the value associated with this entry
     */

    public int getValue()
    {
        return value;
    }

    /**
     * Sets the key of this entry.
     *
     * @param key the new key
     */

    public void setKey(int key)
    {
        this.key = key;
    }

    /**
     * Sets the value of this entry.
     *
     * @param value the new value
     */
    
    public void setValue(int value)
    {
        this.value = value;
    }

}