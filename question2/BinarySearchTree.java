// Purpose: Implementation of a binary search tree.	

public class BinarySearchTree
{
    private TreeNode root;

    /**
     * Constructs an empty binary search tree.
     */

    public BinarySearchTree()
    {
        root = null;
    }

    /**
     * Inserts an element into the binary search tree.
     * 
     * @param element the element to be inserted
     */

    public void insert(Contact contact)
    {
        TreeNode newNode = new TreeNode(contact);
        if (root == null)
            root = newNode;
        else
            insertSub(root, newNode);
    }

    /**
     * Inserts a new node into the binary search tree.
     * 
     * @param node the node currently being compared in the tree
     * @param newNode the node to be inserted
     */

    private void insertSub(TreeNode node, TreeNode newNode)
    {
        if (newNode.getContact().compareTo(node.getContact()) < 0)
        {
            if (node.getLeft() == null)
                node.setLeft(newNode);
            else
                insertSub(node.getLeft(), newNode);
        }
        else
        {
            if (node.getRight() == null)
                node.setRight(newNode);
            else
                insertSub(node.getRight(), newNode);
        }
    }

    /**
     * Searches for an element in the binary search tree.
     * 
     * @param element the element to be searched for
     * @return true if the element is found, false otherwise
     */

    public Integer search(String name)
    {
        return searchSub(root, name);
    }

    /**
     * Searches for an element in the binary search tree.
     * 
     * @param node the node currently being compared in the tree
     * @param contact the contact to be searched for
     * @return true if the element is found, false otherwise
     */

    private Integer searchSub(TreeNode node, String name)
    {
        if (node == null)
            return null;
        else if (name.compareTo(node.getContact().getName()) == 0)
            return node.getContact().getNumber();
        else if (name.compareTo(node.getContact().getName()) < 0)
            return searchSub(node.getLeft(), name);
        else
            return searchSub(node.getRight(), name);
    }

    /**
     * Deletes an element from the binary search tree.
     * 
     * @param contact the element to be deleted
     */

    public void delete(String name)
    {
        root = deleteSub(root, name);
    }

    /**
     * Deletes an element from the binary search tree.
     * 
     * @param node the node currently being compared in the tree
     * @param contact the element to be deleted
     * @return the node to be deleted
     */

    private TreeNode deleteSub(TreeNode node, String name)
    {
        if (node == null)
            return null;
        else if (name.compareTo(node.getContact().getName()) < 0)
            node.setLeft(deleteSub(node.getLeft(), name));
        else if (name.compareTo(node.getContact().getName()) > 0)
            node.setRight(deleteSub(node.getRight(), name));
        else
        {
            if (node.getLeft() == null)
                return node.getRight();
            else if (node.getRight() == null)
                return node.getLeft();
            else
            {
                TreeNode temp = findMinSub(node.getRight());
                node.setContact(temp.getContact());
                node.setRight(deleteSub(node.getRight(), temp.getContact().getName()));
            }
        }
        return node;
    }

    /**
     * Finds the minimum element in the binary search tree.
     * 
     * @param node the node currently being compared in the tree
     * @return the minimum element in the tree
     */

     private TreeNode findMinSub(TreeNode node)
    {
        if (node.getLeft() == null)
            return node;
        else
            return findMinSub(node.getLeft());

    }


    /**
     * Prints the binary search tree in ascending order.
     */

    public void inOrder()
    {
        inOrderSub(root);
    }

    /**
     * Prints the binary search tree in ascending order.
     * 
     * @param node the node currently being visited
     */

    private void inOrderSub(TreeNode node)
    {
        if (node != null)
        {
            inOrderSub(node.getLeft());
            System.out.println(node.getContact());
            inOrderSub(node.getRight());
        }
    }
}
