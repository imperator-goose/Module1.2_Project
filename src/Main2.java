import java.util.*;
public class Main2{
    public static boolean Check(String str) {
        Stack<Character> scobki = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                scobki.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (scobki.isEmpty() || !IsMatchingPair(scobki.peek(), c)) {
                    return false;
                } else {
                    scobki.pop();
                }
            }
            else {
                return false;
            }
        }
        return scobki.isEmpty();
    }

    public static boolean IsMatchingPair(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        } else if (c1 == '{' && c2 == '}') {
            return true;
        } else if (c1 == '[' && c2 == ']') {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[]args){
        String s1 = "{()[]}";
        System.out.println(Check(s1));
        String s2 = "{}";
        System.out.println(Check(s2));
        String s3 = "35 лет назад крупнейший в мире военно-транспортный самолет Ан-124 «Руслан» совершил первый полет 24 декабря 1982 года в Киеве совершил свой первый полет крупнейший в мире военно-транспортный самолет Ан-124 «Руслан» (в терминологии НАТО «Кондор»), созданный в киевском ОКБ Олега Антонова.";
        System.out.println(Check(s3));
        String s4 = "{()[}";
        System.out.println(Check(s4));
    }
}
