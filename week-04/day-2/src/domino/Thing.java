package domino;

public class Thing implements Comparable<Thing>{
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
    public int compareTo(Thing thing) {
        if (completed && !thing.completed){
            return -1;
        } else if(!completed && thing.completed){
            return 1;
        }
        return name.compareTo(thing.name);
    }
}
