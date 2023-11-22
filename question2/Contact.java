
/**
 * Represents an contact in an address book.
 */

public class Contact
{
    private String name;
    private int number;

    /**
     * Constructs a contact.
     * 
     * @param name the name of the contact
     * @param number the contact's phone number
     */

    public Contact(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    /**
     * Returns the name of the contact.
     * 
     * @return the name of the contact
     */

    public String getName()
    {
        return name;
    }

    /**
     * Returns the phone number of the contact.
     * 
     * @return the phone number of the contact
     */

    public int getNumber()
    {
        return number;
    }

    /**
     * Sets the name of the contact.
     * 
     * @param name the name of the contact
     */

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sets the phone number of the contact.
     * 
     * @param number the phone number of the contact
     */

    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * Returns a string representation of the contact.
     * 
     * @return a string representation of the contact
     */

    public String toString()
    {
        return name + " " + number;
    }

    /**
     * Compares this contact to another contact.
     * 
     * @param other the other contact to be compared
     * @return a negative integer if this contact comes before the other contact,
     *         zero if the contacts are equal, a positive integer if this contact
     *         comes after the other contact
     */

    public int compareTo(Contact other)
    {
        return name.compareTo(other.getName());
    }

}