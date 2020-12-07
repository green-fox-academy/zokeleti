package greenfox_organization;

public class Mentor extends Person {
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String level;

    public Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }
    public Mentor(){
        level = "intermediate";
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
    }

}
