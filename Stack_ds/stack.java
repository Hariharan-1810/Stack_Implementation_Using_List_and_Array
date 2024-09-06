package Stack_ds;

import java.util.ArrayList;

public class stack
{
    ArrayList<Integer> s = new ArrayList<>();

    public void push(int x)
    {
        s.add(x);
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }

        int top = s.get(s.size() - 1);
        s.remove(s.size() - 1);
        return top;
    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return s.get(s.size() - 1);
    }
    
    public boolean isEmpty()
    {
        return s.isEmpty();
    }

    public int size()
    {
        return s.size();
    }

    
    public void display()
    {
        for(int i = 0; i < s.size(); i++)
        {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }
}
