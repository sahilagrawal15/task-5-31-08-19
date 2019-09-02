import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"ritik",4000,"it");
		Employee e2=new Employee(102,"ankit",9000,"op");
		Employee e3=new Employee(103,"keshav",3000,"dev");
		Employee e4=new Employee(104,"pritesh",2000,"tester");
		Employee e5=new Employee(105,"suyash",8000,"manager");
		Employee e6=new Employee(105,"suyash",8000,"acc");
		
		Project p1=new Project(5001,"ML",4,"ayush");
		Project p2=new Project(5002,"AI",4,"umang");
		Project p3=new Project(5003,"ML",4,"vishal");
		Project p4=new Project(5004,"IOT",4,"amit");
		Project p5=new Project(5005,"Java",4,"ashish");
		
		HashMap<Employee, Project> map = new HashMap<>();
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p3);
		map.put(e4, p4);
		map.put(e5, p5);
		map.put(e6, p5);
		System.out.println(map);
	}

}
