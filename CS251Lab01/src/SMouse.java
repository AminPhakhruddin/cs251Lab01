
public class SMouse
{
  private int age = 0;
  private double weight = 1.0;

  public void grow()
  {
    this.weight += 0.2 * this.getAge();
    this.setAge(this.getAge() + 1);
  }

  public void display()
  {
	  System.out.println("His age is " + this.getAge());
	  System.out.println("His weight is " + this.weight);
	  System.out.println();
  }

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}