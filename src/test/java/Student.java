public class Student {
    String Name;
    String lastName;
    int[]grades={};

    public Student(String studentName, String lastName) {
        Name = studentName;
        this.lastName = lastName;
    }

    public void PrintName(){
        System.out.println(Name +" "+lastName);
    }

    public void Study() {
        System.out.println("I am studying");


    }
    public void FailClass() {
        System.out.println("I failed");


    }
    public void Graduate(){
        System.out.println("I graduated");
    }
}
