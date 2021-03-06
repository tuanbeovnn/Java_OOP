package Excercise_Dat4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Manage {
    private ArrayList<Information> information;

    public Manage(){
        this.information = new ArrayList<>();
    }

    public void addStaff(Information staffAdd){
        this.information.add(staffAdd);
    }

    public List<Information> searchInformation(int id){
        return this.information.stream().filter(ob->ob.getStaffId()==id).collect(Collectors.toList());
    }
    public void showList(){
        this.information.forEach(ob-> System.out.println(ob.toString()));
    }

    public void update(Information information){
        List<Information> info = this.searchInformation(information.getStaffId());
        System.out.println(info.size());
        info.get(0).setName(information.getName());
        info.get(0).setGender(information.getGender());

    }

}
