// Purpose: TreeNode class for use in a binary tree.

public class TreeNode 
{
    private Contact contact;
    private TreeNode left;
    private TreeNode right;

    /**
     * Constructs a tree node with the specified contact.
     * 
     * @param element the element to store in this node
     */

    public TreeNode(Contact contact)
    {
        this.contact = contact;
        left = null;
        right = null;
    }

    /**
     * Returns the contact stored in this node.
     * 
     * @return the contact stored in this node
     */

    public Contact getContact()
    {
        return contact;
    }

    /**
     * Returns the left subtree of this node.
     * 
     * @return the left subtree of this node
     */

    public TreeNode getLeft()
    {
        return left;
    }

    /**
     * Returns the right subtree of this node.
     * 
     * @return the right subtree of this node
     */

    public TreeNode getRight()
    {
        return right;
    }

    /**
     * Sets the left subtree of this node.
     * 
     * @param node the left subtree of this node
     */

    public void setLeft(TreeNode node)
    {
        left = node;
    }

    /**
     * Sets the right subtree of this node.
     * 
     * @param node the right subtree of this node
     */

    public void setRight(TreeNode node)
    {
        right = node;
    }

    /**
     * Sets the contact stored in this node.
     * 
     * @param element the contact stored in this node
     */

    public void setContact(Contact contact)
    {
        this.contact = contact;
    }

    /**
     * Returns a string representation of this node.
     * 
     * @return a string representation of this node
     */

    public String toString()
    {
        return contact.getName() + " " + contact.getNumber();
    }

}
