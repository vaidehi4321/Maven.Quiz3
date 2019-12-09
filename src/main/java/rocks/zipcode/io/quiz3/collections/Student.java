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

    public Student(String name,LabStatus labStatus, List<Lab> list) {
        this.name = name;
        //this.labStatus = labStatus;
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
        for(Lab lab:list){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null ;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab=getLab(labName);
        try{
            lab.setStatus(labStatus);

        }
        catch(Exception e){
            throw new UnsupportedOperationException(e);

        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        list.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab lab: list){
            if( lab.getName().equals(labName)){
                return lab.getStatus();
            }
        }
        return null ;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--) {
           sb.append(list.get(i).getName()+ " > "+getLabStatus(list.get(i).getName())+"\n");

        }
        String result=sb.toString();
        return result.trim();
    }
}
