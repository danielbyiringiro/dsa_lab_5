/**
 * /**
 * PROBLEM 2: Implementing a Telephone Directory using a Binary Search Tree
You are asked to implement a telephone directory in Java using the Binary Search Tree (BST)
data structure. You are not supposed to use the in-built in Java classes related such as TreeMap
or TreeSet.
The following functions are expected in your application:
 Insert a new contact into the telephone directory
 Search for a contact in the telephone directory
 Delete a contact from the telephone directory
 Print the telephone directory in ascending order

 * Minimum functionality, Ideas/Hints:
 Insert(contact): Inserts a new contact into the telephone directory.
 Search(contactName): Searches for a contact in the telephone directory and returns their
phone number, if found. (Hint: To do this, you might use the contact’s name to store the
elements in the BST).
 Delete(contactName): Deletes a contact from the telephone directory.
 Print(): Prints the telephone directory in ascending order.
Write a main class that tests your binary search tree class. Your main class should do the
following:
 Create a new binary search tree object.
 Insert a few contacts into the telephone directory.
 Search for a contact in the telephone directory.
 Delete a contact from the telephone directory.
 Print the telephone directory.
*/

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
