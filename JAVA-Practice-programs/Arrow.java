import java.util.Scanner;
public class Arrow{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i, j;
int n = sc.nextInt();  // ‘n’ must be odd
int num1 = n / 2 * 3;
// right arrow
System.out.println("Right Arrow");
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
if(i == n / 2 || j - i == n / 2 || i + j == num1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
// left arrow
System.out.println("Left Arrow");
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
if(i == n / 2 || i - j == n / 2 || i + j == n / 2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}