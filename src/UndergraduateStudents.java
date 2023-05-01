import java.util.ArrayList;
import java.util.List;

public class UndergraduateStudents implements Students {
    // студент бакалавриата
    private List<String> studList;

    public UndergraduateStudents(){
        studList = new ArrayList<String>();
    }

    public UndergraduateStudents(List<String> list){
        this.studList = list;
    }
    public void loadData(){
        studList.add("Антон");
        studList.add("Илья");
        studList.add("Екатерина");
        studList.add("Кристина");
    }

    public List<String> getStudList() {
        return studList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getStudList()){
            temp.add(s);
        }
        return new UndergraduateStudents(temp);
    }
}
