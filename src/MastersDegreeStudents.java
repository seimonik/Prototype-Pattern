import java.util.ArrayList;
import java.util.List;

public class MastersDegreeStudents implements Students{
    //студент магистратуры
    private List<String> studList;

    public MastersDegreeStudents(){
        studList = new ArrayList<String>();
    }

    public MastersDegreeStudents(List<String> list){
        this.studList = list;
    }
    public void loadData(){
        studList.add("Иван");
        studList.add("Григорий");
        studList.add("Леонид");
        studList.add("Филипп");
        studList.add("Анна");
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
        return new MastersDegreeStudents(temp);
    }
}
