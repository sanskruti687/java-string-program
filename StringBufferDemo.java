// StringBuffer Program demonstrating major methods

public class StringBufferDemo {
    public static void main(String[] args) {

        // 1. Create StringBuffer object
        StringBuffer sb = new StringBuffer("Sanskruti");
        System.out.println("Original StringBuffer: " + sb);

        // 2. append()
        sb.append(" Pawar");
        System.out.println("After append(): " + sb);

        // 3. insert()
        sb.insert(0, "Ms. ");
        System.out.println("After insert(): " + sb);

        // 4. replace()
        sb.replace(0, 3, "Miss");
        System.out.println("After replace(): " + sb);

        // 5. delete()
        sb.delete(0, 5);
        System.out.println("After delete(): " + sb);

        // 6. deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(): " + sb);

        // 7. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // Reverse again to get original order
        sb.reverse();

        // 8. charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 9. setCharAt()
        sb.setCharAt(0, 'L');
        System.out.println("After setCharAt(): " + sb);

        // 10. length()
        System.out.println("Length of StringBuffer: " + sb.length());

        // 11. capacity()
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        // 12. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());

        // 13. substring()
        System.out.println("Substring from index 2: " + sb.substring(2));
        System.out.println("Substring (2, 6): " + sb.substring(2, 6));

        // 14. indexOf()
        System.out.println("Index of 'Pawar': " + sb.indexOf("Pawar"));

        // 15. lastIndexOf()
        System.out.println("Last index of 'a': " + sb.lastIndexOf("a"));

        // 16. toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
