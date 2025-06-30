package mypack;

import java.util.Arrays;

public class MyList<T>
{
    private Object[] myarr;
    private int size;
    private static  int list_capacity=10;
    public MyList()
    {
        myarr=new Object[list_capacity];
        size=0;
    }
    public void add(T object)
    {
        checkCapacity();
        myarr[size++]=object;
    }
    public Object get(int i)
    {
        checkIndex(i);
        return myarr[i];
    }
    public void set(int index,T obj)
    {
        checkIndex(index);
        myarr[index]=obj;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        if(size>0)
        {
            return false;
        }
        return true;
    }
    public void remove(int ind)
    {
        checkIndex(ind);
       for(int i=ind;i<size-1;i++)
       {
         myarr[i]=myarr[i+1];
       }
       size--;

    }
    public boolean contains(T object)
    {
        for(int i=0;i<size;i++)
        {
            if(myarr[i].equals(object))
            {
                return true;
            }
        }
        return false;
    }
    public void checkCapacity()
    {
        if(size==myarr.length)
        {
            int new_capacity=size*2;
            myarr=Arrays.copyOf(myarr, new_capacity);
        }
    }
    public void checkIndex(int i)
    {
      
        if(i<0 && i>=size)
        {
            throw new IndexOutOfBoundsException("Index: " + i + " is out of bounded in Size: " + size);
        }
        
    }
    public void clear()
    {
        myarr=new Object[list_capacity];
        size=0;
     
    }
    public int indexOf(T object)
    {
        for(int i=0;i<size;i++)
        {
            if(myarr[i].equals(object))
            {
                return i;
            }
        }
        return -1;
    }


}
