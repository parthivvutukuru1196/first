import java.io.*;

class sample
{


void disp(int a, int b)
{
System.out.println(a+b);
System.out.println("Hello GitHub!!!");
}
}
class demo extends sample
{
void disp(int a, int b)
{
System.out.println(a*b);
}

public static void main(String[] args)
{
demo d = new demo();
sample s = new demo();
d.disp(10,20);
s.disp(5,5);
}
}
