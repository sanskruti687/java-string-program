// String Program demonstrating important String methods

public class StringDemo {
    public static void main(String[] args) {

        // 1. Create String
        String s1 = "Sanskruti Pawar";
        String s2 = "sanskruti pawar";

        System.out.println("Original String: " + s1);

        // 2. length()
        System.out.println("Length: " + s1.length());

        // 3. charAt()
        System.out.println("Character at index 2: " + s1.charAt(2));

        // 4. toUpperCase()
        System.out.println("Uppercase: " + s1.toUpperCase());

        // 5. toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());

        // 6. equals()
        System.out.println("Equals: " + s1.equals(s2));

        // 7. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        // 8. compareTo()
        System.out.println("Compare To: " + s1.compareTo(s2));

        // 9. contains()
        System.out.println("Contains 'Pawar': " + s1.contains("Pawar"));

        // 10. startsWith()
        System.out.println("Starts with 'Sans': " + s1.startsWith("Sans"));

        // 11. endsWith()
        System.out.println("Ends with 'Pawar': " + s1.endsWith("Pawar"));

        // 12. indexOf()
        System.out.println("Index of 'a': " + s1.indexOf('a'));

        // 13. lastIndexOf()
        System.out.println("Last index of 'a': " + s1.lastIndexOf('a'));

        // 14. substring()
        System.out.println("Substring from index 4: " + s1.substring(4));
        System.out.println("Substring (4, 9): " + s1.substring(4, 9));

        // 15. replace()
        System.out.println("Replace 'Pawar' with 'Patil': " + s1.replace("Pawar", "Patil"));

        // 16. trim()
        String s3 = "   Hello Java   ";
        System.out.println("Trimmed String: '" + s3.trim() + "'");

        // 17. split()
        String[] parts = s1.split(" ");
        System.out.println("Split result:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 18. isEmpty()
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());

        // 19. concat()
        System.out.println("Concat: " + s1.concat(" Developer"));

        // 20. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf int to String: " + numStr);
    }
}
