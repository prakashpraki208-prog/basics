class Student7 {
    int id;
    String name;

    // Parameterized constructor
    Student7(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student7 s1 = new Student7(101, "prakash");
        Student7 s2 = new Student7(102, "priya");

        s1.display();
        s2.display();
    }
}
