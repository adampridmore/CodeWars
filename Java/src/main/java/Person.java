public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String greet(String yourName) {
        return String.format("Konbanwa! My name is %s. It is nice to meet you, %s!", name, yourName);
    }
}