import java.util.*;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.print(firstRepeatingCharacter(s));
        
    }

    static char firstRepeatingCharacter(String s) {
        Set<Character> h = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (h.contains(c)) {
                return c;
            } else {
                h.add(c);
            }
        }
        
        return '0'; 
    }
}
