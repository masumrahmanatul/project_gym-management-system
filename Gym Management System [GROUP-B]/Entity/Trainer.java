package Entity;

public class Trainer {
    private String name;
    private int age;
    private String height;
    private float weight;
    private char gender;
    private String trainerId;
    private float salary;

    public Trainer(String name, int age, String height, float weight, char gender, String trainerId, float salary) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.trainerId = trainerId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Trainer ID: " + trainerId + ", Name: " + name + ", Age: " + age + ", Height: " + height +
                ", Weight: " + weight + ", Gender: " + gender + ", Salary: " + salary;
    }
}
