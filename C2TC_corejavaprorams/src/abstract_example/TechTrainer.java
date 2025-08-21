package abstract_example;

public class TechTrainer extends Trainer{
public void session() {
	System.out.println("java session is going on");
}
@Override
public void checks() {
	System.out.println("Asssingment is given from innheritence");
}
}