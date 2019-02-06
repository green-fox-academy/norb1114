package comparable.todo;

public class Thing implements Comparable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Object o) {
        Thing otherThing = (Thing) o;

        int myInt = this.completed ? 1 : 0;
        int otherInt = otherThing.completed ? 1 : 0;

        if(otherInt > myInt) {
            return 1;
        } else if(otherInt < myInt) {
            return -1;
        } else {
            return 0;
        }
    }
}