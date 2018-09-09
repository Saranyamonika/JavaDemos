import java.io.*;
class TestInput
{
public static void main(String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String str1=br.readLine();
String str2=br.readLine();
System.out.println("Welcome"+str1+" "+str2);
}
catch(Exception e)
{

}
}
}