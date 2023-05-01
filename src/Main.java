import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students studB = new UndergraduateStudents();
        studB.loadData();

        Students studNew = (Students) studB.clone();
        List<String> list = studNew.getStudList();
        list.add("Альберт");
        list.remove("Антон");

        System.out.println("studB List: " + studB.getStudList());
        System.out.println("studNew List: " + list);

        Students studM = new MastersDegreeStudents();
        studM.loadData();

        Students studMNew = (Students) studM.clone();
        List<String> list1 = studMNew.getStudList();
        list1.add("Елизавета");
        list1.remove("Филипп");

        System.out.println("studM List: " + studM.getStudList());
        System.out.println("studMNew List: " + list1);
    }
}