package greenFoxOrganization;

public class Mentor extends Person {

    String level;

    @Override
    public void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " " + level + " mentor.");
    }
    public Mentor(String name, int age, String gender, String level) {
        super();
        this.level = level;
    }
    public Mentor() {
        super();
        this.level = "intermediate";
    }
}
