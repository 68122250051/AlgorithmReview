import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Type Data");
        s.push("Type Structure");
        s.push("Delete Structure");
        s.push("Type Algorithm");
        s.push("Type Java");

        System.out.println(s);

        if(!s.empty()){
            System.out.println("Undo : "+s.pop());
        }

        if(!s.empty()){
            System.out.println("Undo : "+s.pop());
        }

        System.out.println("Stack Now");
        System.out.println(s);

        System.out.println("LIFO = Last In First Out");
    }
}