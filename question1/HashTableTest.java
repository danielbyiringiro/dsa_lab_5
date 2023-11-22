public class HashTableTest 
{
    public static void main(String[] args)
    {
        // Test 1: Insertion

        HashTable table = new HashTable();

        System.out.println();
        table.insert(1, 100);
        table.insert(2, 200);
        table.insert(3, 300);
        table.insert(4, 400);
        table.insert(5, 500);
        table.insert(6, 600);
        table.insert(7, 700);
        table.insert(8, 800);
        table.insert(9, 900);
        table.insert(10, 1000);
        table.insert(11, 1100);
        table.insert(12, 1200);
        table.insert(13, 1300);
        table.insert(14, 1400);
        table.insert(15, 1500);
        table.insert(16, 1600);
        table.insert(17, 1700);
        table.insert(18, 1800);
        table.insert(19, 1900);
        table.insert(20, 2000);

        table.print();
        System.out.println();

        // the table should resize to 22

        System.out.println();
        System.out.println(table.getCapacity());
        System.out.println(table.getSize());
        System.out.println();

        // Test 2: Search

        System.out.println();
        System.out.println(table.search(1));
        System.out.println(table.search(2));
        System.out.println(table.search(3));
        System.out.println(table.search(4));
        System.out.println(table.search(55));
        System.out.println();


        // Test 3: Deletion

        System.out.println();
        table.delete(1);
        table.delete(2);
        table.delete(3);
        table.delete(4);
        table.delete(55);
        table.print();
        System.out.println();

        // Test 4: Collision Resolution

        System.out.println();
        table.insert(1, 100);
        table.insert(2, 200);
        table.insert(3, 300);
        table.insert(4, 400);
        table.insert(5, 5555);

        table.print();
        System.out.println();
    }
    
}
