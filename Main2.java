import Stack_array.stack;

public class Main2
{
    public static void main(String[] args)
    {
        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();

        System.out.println("Top element: " + s.peek());
        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println(s.size() + " elements in the stack" );

    }
}
