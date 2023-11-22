public class PhoneDirectoryTest 
{
    public static void main(String[] args)
    {   
        // Create a phone directory
        PhoneDirectory directory = new PhoneDirectory();

        // Insert some entries
        directory.insert("John", 1234567);
        directory.insert("Mary", 2345678);
        directory.insert("Steve", 3456789);
        directory.insert("Anne", 4567890);
        directory.insert("Donna", 5678901);
        directory.insert("Ken", 6789012);
        directory.insert("Ellen", 7890123);
        directory.insert("Ed", 8901234);
        directory.insert("Carol", 9012345);

        System.out.println();
        System.out.println("Phone directory:");
        System.out.println();
        directory.print();
        System.out.println();

        // Search for some entries

        System.out.println();
        System.out.println("Search for Steve: " + directory.search("Steve"));
        System.out.println("Search for Ellen: " + directory.search("Ellen"));
        System.out.println("Search for Donna: " + directory.search("Donna"));
        System.out.println("Search for Daniel: " + directory.search("Daniel")); // returns null
        System.out.println();

        // Delete some entries

        
        System.out.println("Delete Steve, Ellen, and Donna");
        System.out.println();
        directory.delete("Steve");
        directory.delete("Ellen");
        directory.delete("Donna");
        directory.print();
        System.out.println();

        // Print the phone directory

        
        System.out.println("Phone directory:");
        System.out.println();
        directory.print();


    }
}
