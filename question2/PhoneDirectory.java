public class PhoneDirectory 
{
    private BinarySearchTree bst;

    /**
     * Constructs a phone directory.
     */

    public PhoneDirectory()
    {
        bst = new BinarySearchTree();
    }

    /**
     * Inserts a new entry into the phone directory.
     * 
     * @param name the name of the person
     * @param number the person's phone number
     */

    public void insert(String name, int number)
    {
        Contact contact = new Contact(name, number);
        bst.insert(contact);
    }

    /**
     * Searches for an entry in the phone directory.
     * 
     * @param name the name of the person to search for
     * @return the phone number of the person, or null if not found
     */

    public Integer search(String name)
    {
        Integer result = bst.search(name);
        return result;
    }

    /**
     * Deletes an entry from the phone directory.
     * 
     * @param name the name of the person to delete
     */

    public void delete(String name)
    {
        bst.delete(name);
    }

    /**
     * Prints the phone directory.
     */

    public void print()
    {
        bst.inOrder();
    }
}
