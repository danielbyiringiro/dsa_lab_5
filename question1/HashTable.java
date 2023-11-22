/**
 * A hash table implementation that uses open addressing with linear probing for collision resolution.
 * @author Daniel Byiringiro
 */

public class HashTable
{
    private Entry[] table;
    private int size;
    private int capacity;

    /**
     * Constructor
     * @param capacity the initial capacity of the hash table
     */

    public HashTable(int capacity)
    {
        this.capacity = capacity;
        table = new Entry[capacity];
        size = 0;
    }
    
    /**
     * Default constructor
     */

    public HashTable()
    {
        this(11);
    }

    
    /**
     * Returns the size of the hash table.
     *
     * @return the size of the hash table
     */

    public int getSize()
    {
        return size;
    }

    /**
     * Returns the capacity of the hash table.
     *
     * @return the capacity of the hash table
     */

    public int getCapacity()
    {
        return capacity;
    }

    /**
     * Returns true if the hash table is empty, false otherwise.
     *
     * @return true if the hash table is empty, false otherwise
     */

    public boolean isEmpty()
    {
        return size == 0;
    }

    /**
     * Returns true if the hash table is full, false otherwise.
     *
     * @return true if the hash table is full, false otherwise
     */

    public boolean isFull()
    {
        return getSize() == getCapacity();
    }

    /**
     * Calculates the primary hash value for a given key.
     * 
     * @param key the key for which the primary hash value is calculated
     * @return the primary hash value for the given key
     */

    public int primaryHash(int key)
    {
        return key % getCapacity();
    }

    /**
     * Calculates the secondary hash value for a given key.
     * 
     * @param key the key for which the secondary hash value is calculated
     * @return the secondary hash value for the given key
     */

    public int secondaryHash(int key)
    {
        // choose a prime number smaller than the capacity
        return 7 - (key % 7);
    }

    /**
     * Inserts a key-value pair into the hash table.
     * 
     * @param key the key to be inserted
     * @param value the value to be inserted
     */

    public void insert(int key, int value)
    {
        if (isFull())
        {
            resize();
        }

        int newIndex = -1;
        int primaryIndex = primaryHash(key);
        int secondaryIndex = secondaryHash(key);

        int i = 0;

        while (i < getCapacity()) 
        {
            int index = (primaryIndex + i * secondaryIndex) % getCapacity();

            if (table[index] == null) {
                newIndex = index;
                break;
            } else if (table[index].getKey() == (Integer) key) {
                table[index].setValue(value);
                return;
            }

            i++;
        }

        if (newIndex != -1)
        {
            table[newIndex] = new Entry(key, value);
            size++;
            return;
        }

        else
        {
            resize();
            insert(key, value);
        }  
    }

    /**
     * Searches for a key in the hash table.
     * 
     * @param key the key to be searched for
     * @return the value associated with the key, or -1 if the key is not found
     */

    public int search(int key)
    {
        int primaryIndex = primaryHash(key);
        int secondaryIndex = secondaryHash(key);

        int i = 0;

        while (i < getCapacity()) 
        {
            int index = (primaryIndex + i * secondaryIndex) % getCapacity();

            if (table[index] == null)
            {
                return -1;
            }
            else if (table[index].getKey() == key)
            {
                return table[index].getValue();
            }

            i++;
        }

        return -1;
    }

    /**
     * Deletes a key-value pair from the hash table.
     * 
     * @param key the key to be deleted
     */

    public void delete(int key)
    {
        int primaryIndex = primaryHash(key);
        int secondaryIndex = secondaryHash(key);

        int i = 0;

        while (i < getCapacity()) 
        {
            int index = (primaryIndex + i * secondaryIndex) % getCapacity();

            if (table[index] != null && table[index].getKey() == key)
            {
                table[index] = null;
                size--;
                return;
            }

            i++;
        }
    }

    /**
     * Resizes the hash table to twice its current capacity.
     */

    public void resize()
    {
        int newCapacity = getCapacity() * 2;
        Entry[] newTable = new Entry[newCapacity];

        for (int i = 0; i < getCapacity(); i++)
        {
            if (table[i] != null)
            {
                int newIndex = -1;
                int primaryIndex = primaryHash(table[i].getKey());
                int secondaryIndex = secondaryHash(table[i].getKey());

                int j = 0;

                while (j < newCapacity) 
                {
                    int index = (primaryIndex + j * secondaryIndex) % newCapacity;

                    if (newTable[index] == null)
                    {
                        newIndex = index;
                        break;
                    }

                    j++;
                }

                if (newIndex != -1)
                {
                    newTable[newIndex] = table[i];
                }
            }
        }

        table = newTable;
        capacity = newCapacity;
    }

    /**
     * Prints the contents of the hash table.
     */

    public void print()
    {
        for (int i = 0; i < getCapacity(); i++)
        {
            if (table[i] != null)
            {
                System.out.println("Key: " + table[i].getKey() + " Value: " + table[i].getValue());
            }
        }
    }

}