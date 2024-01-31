class student2
{
int roll;
String name;
float mark;
}
class exam extends student2
{
void getdata()
{
roll=101;
name="Karim";
}
}
class result extends exam
{
void getmark()
{
mark=50.55f;
}
void display()
{
System.out.println("Roll is "+roll);
System.out.println("Name is "+name);
System.out.println("Mark is "+mark);
}
}
class multilevel_inheritace
{
public static void main(String args[])
{
result r=new result();
r.getdata();
r.getmark();
r.display();
}
}
