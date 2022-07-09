package day31_Constructors.scrumTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam_3 {

    public String PO,BA,SM;//burada yine diğerleri gibi eklenecekleri yazdık
    public ArrayList<Tester_1>testersList=new ArrayList<>();
    public ArrayList<Developer_2>devopsList=new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam_3(String PO, String BA, String SM, int daysOfSprint) {//constructorumuzu kurduk
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
//bu alttaki dördü instance method
    public void addTester(Tester_1 tester){//adds the given tester to the testers ArrayList
        testersList.add(tester);
    }

    public void addTesters(Tester_1[]testers){//adds the given testers to the testers ArrayList
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer_2 developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer_2[]developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){//üstte ekledik bir şeyler şimdi remove edeceğiz
        testersList.removeIf(p->p.employeeID==employeeID);
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p->p.employeeID==employeeID);
    }
    //üstte yaptıklarımız myscrum teame eklemek için.hem normal şekilde hem de array olarak eklemek için bu şekilde yazdık

    public String toString() {
        return "ScrumTeam_3{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
create a class called ScrumTeam
           Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = newArrayList<>();
                ArrayList<Developer> devopsList =new ArrayList<>();
                int daysOfSprint;
               Add A constructor that can set the
fileds PO, BA, and SM
             Actions:
                  addTester(Tester tester): adds the given tester to the testers ArrayList
                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList
                  addDeveloper(Developer
developer): adds the given developer to the developers ArrayList
                  addDevelopers(Developer[]
developers): adds the given developers to the developers ArrayList
                  removeTester(long employeeID):
removes the given tester from the testers ArrayList
                  removeDeveloper(long employeeID):
removes the developer from the developers ArrayList
                  toString(): prints number of
tester,& developers,  PO name, SM name, BA name
 */
