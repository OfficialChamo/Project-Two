public class Project_2 {
    String name;
    Project_2(String value){
        name = value;
        System.out.println(name);
    }
     public static void main(String[] args) {
        Project_2 project = new Project_2("Java");
        Project_2 project2 = new Project_2("Python");
        Project_2 project3 = new Project_2("C");
        Project_2 project4 = new Project_2("Kotlin");

    }
}
