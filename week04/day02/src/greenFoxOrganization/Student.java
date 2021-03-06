package greenFoxOrganization;


public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    @Override
    public void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce () {
        System.out.println("Hi, I'm " +  name + ", a age year old " + gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

}
