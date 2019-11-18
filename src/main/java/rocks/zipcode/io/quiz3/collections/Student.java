package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
String name;
    Boolean labStatus;
    List<Lab>list;


    public void setName(String name) {
        this.name = name;
    }

    public void setLabStatus(Boolean labStatus) {
        this.labStatus = labStatus;
    }

    public void setList(List<Lab> list) {
        this.list = list;
    }

    public Student(String name, Boolean labStatus, List<Lab> list) {
        this.name = name;
        this.labStatus = labStatus;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public Boolean getLabStatus() {
        return labStatus;
    }

    public List<Lab> getList() {
        return list;
    }


    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {

        this.list=new ArrayList<>();

    }


    public Lab getLab(String labName) {
        return null ;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
