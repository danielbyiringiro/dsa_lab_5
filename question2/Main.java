public class Main 
{
    public static void main(String[] args)
    {
        PhoneDirectory directory = new PhoneDirectory();
        directory.insert("John", 1234567);
        directory.insert("Mary", 2345678);
        directory.insert("Steve", 3456789);
        directory.insert("Anne", 4567890);
        directory.insert("Donna", 5678901);
        directory.insert("Ken", 6789012);
        directory.insert("Ellen", 7890123);
        directory.insert("Ed", 8901234);
        directory.insert("Carol", 9012345);

        System.out.println("Phone directory:");
        directory.print();
    }
}
