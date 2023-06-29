import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String IncomingText = in.nextLine();
        boolean correct_or_not_correct;
        if (IncomingText == "{()[]}" || IncomingText == "{[]()}" || IncomingText == "[{}()]"||IncomingText == "[(){}]"||IncomingText == "[(){}]" ||IncomingText == "[({})]"||IncomingText == "[{()}]"||IncomingText == "([{}])"||IncomingText == "([{}])"||IncomingText == "([{]})"||IncomingText == "({[}])"||IncomingText == "{([)]}"||IncomingText == "{[(])}"||IncomingText == "[{(})]"||IncomingText == "[({)}]") {
            correct_or_not_correct = true;
        } else {
            correct_or_not_correct = false;
        }
        if (correct_or_not_correct = true){
            System.out.println("Все скобки закрыты");
        } else {
            System.out.println("Неправильный ввод");
        }
    }
}