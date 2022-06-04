package test1;

public class EX
{
    public void func1()
    {
        System.out.print(1);
    }
    
    private void func2()
    {
        System.out.print(2);
    }
    
    private void func3()
    {
        System.out.print(3);
    }
    
    
    public EX()
    {
        func2();
        System.out.print(4);
        func2();
    }
}