package Stack_array;

public class stack
{
    int arr[] = new int [100];
    int top = -1;

    public void push(int x)
    {
        if(top >= 99)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            top++;
            arr[top] = x;
        }
    }

    public int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int x = arr[top];
            top--;
            return x;
        }
    }

    public int peek()
    {
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return arr[top];
        }
    }

    public boolean isEmpty()
    {
        return (top < 0);
    }

    public void display()
    {
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            for(int i = top; i >= 0; i--)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int size()
    {
        return (top + 1);
    }
}
