package singleInheritance;

public class SlInheritanceDemo {

	public static void main(String[] args) {
		Trainer t = new Trainer(45,"Sharan","Puducherry",46,"Developer","pondicheery");
		System.out.println(t);
		Person p = new Person(46,"Sharan kumar","Puducherry");
		System.out.println(p);
	}

}