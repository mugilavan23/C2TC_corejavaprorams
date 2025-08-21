package abstract_example;

public class TnsifCgDemo {

	public static void main(String[] args) {
	Trainer t = new TechTrainer();
	t.checks();
	t.session();
	t= new SoftSkillTrainer();
	t.session();
	t.checks();

	}

}