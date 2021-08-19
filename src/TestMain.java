import java.util.*;
import java.util.stream.Collectors;

public class TestMain {
    static class Employe {
        public Employe(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        String firstName;
        String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    public static void main(String[] args) {
//        TestInterface t = () -> System.out.println("Heelo Test Interface is overddied");
//        int a = t.test(5, 6);
//        System.out.println(a);
//        t.print();

        Employe e1 = new Employe("SUraj", "Regmi");
        Employe e2 = new Employe("Topa", "Timilsina");
        Employe e3 = new Employe("Sudipa", "Tarki");
        Employe e4 = new Employe("Sudip", "Tdhikari");
        Employe e5 = new Employe("Sandeep", "Upadhyay");
        List<Employe> employees = Arrays.asList(e1, e2, e3, e4, e5);

        List<Employe> sortedList = new ArrayList<>();
        List<Employe> emmployeWithT = new ArrayList<>();
        for (Employe employe : employees) {
            if (employe.getLastName().startsWith("T")) {
                emmployeWithT.add(employe);
            }
        }
        Collections.sort(emmployeWithT, Comparator.comparing(Employe::getLastName));
        emmployeWithT.forEach(emmployeWithT1 -> System.out.println(emmployeWithT1.firstName));


//        List<Employe> filterAndSotedEmployes = employees.stream().filter(
//                employe -> employe.lastName.startsWith("T")
//        ).sorted((emp1, emp2) -> emp1.firstName.compareTo(emp2.firstName)).collect(Collectors.toList());

        List<Employe> filterAndSotedEmployes = employees.stream().filter(
                employe -> employe.lastName.startsWith("T")
        ).sorted(Comparator.comparing(Employe::getLastName).reversed()).collect(Collectors.toList());

//        filterAndSotedEmployes.forEach(employe ->
//                System.out.println(employe.firstName));
    }
}
