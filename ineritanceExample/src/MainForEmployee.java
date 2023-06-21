public class MainForEmployee {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.display();

        Admin A = new Admin();
        A.assignCourse();

        Teacher T = new Teacher();
        T.teach();
    }
}