package abstract_example;

public class SoftSkillTrainer extends Trainer {
public void session() {
	System.out.println("resume building is going on");
}
@Override
public void checks() {
	System.out.println("checked");
}
}