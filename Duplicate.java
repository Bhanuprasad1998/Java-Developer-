import java.util.Scanner;
class Duplicate
{
public static void main(String args[])
{
int []ar = {20,33,43,20,45,44,33,20};
for(int i=0; i<ar.length-1; i++)
{
for(int j= i+1; j<ar.length; j++)
{
if((ar[i]==ar[j])&&(i!=j))
{
System.out.println("Duplicate Element is "+ar[j]);
}
}
}
}
}
