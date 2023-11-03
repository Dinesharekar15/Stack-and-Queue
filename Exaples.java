import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Exaples{
    public static void main(String[] args) {
        Stack<Integer> ob=new Stack<>();
        ob.push(23);
        ob.push(35);
        ob.push(55);
        ob.push(30);
        ob.push(22);

        // System.out.println(ob.pop());
        // System.out.println(ob.pop());

        Queue<Integer> ob1=new LinkedList<>();
            ob1.add(7);
            ob1.add(2);
            ob1.add(5);
            ob1.add(8);
            ob1.add(1);

            // System.out.println(ob1.remove());
            // System.out.println(ob1.peek());
 
            Deque<Integer> ob2=new ArrayDeque<>();
            ob2.add(44);
            ob2.add(55);
            ob2.add(66); 
            ob2.addFirst(33);
            System.out.println(ob2.removeFirst());
            System.out.println(ob2.removeLast());
          
    }
}