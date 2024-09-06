import Stack_ds.stack;

public class Main
{
    public static void main(String[] args)
    {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        s.display();

        s.pop();
        s.display();

        System.out.println("Top element: " + s.peek());
        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println("Size of stack: " + s.size());
    }
}
