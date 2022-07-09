package day37_OOPInheritance.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam_8 {

    public ProductOwner_7 PO;//istendiği için instance variablesı oluşturduk.
    public BusinessAnalyst_6 BA;
    public ScrumMaster_5 SM;

    public ArrayList<Tester_3>testers=new ArrayList<>();
    public ArrayList<Developer_4>developers=new ArrayList<>();

    public ScrumTeam_8(ProductOwner_7 PO, BusinessAnalyst_6 BA, ScrumMaster_5 SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTesters(Tester_3 tester){
        testers.add(tester);//tester methodunu testers arrayliste ekleyecek.
        //burada Tester_3 objecti arrayliste ekliyoruz
        //array listin içine 1 tester ekler
    }

    public void addTesters(Tester_3[]testers){//Tester3 classı arrayliste döndürdük,bu onun methodu
        this.testers.addAll(Arrays.asList(testers));//arrayliste de testersları eklemiş olduk.(karışık gibi ama aslında pek numarası yok.)
        //burada da Tester_3 arrayini testers arrayListine ekliyoruz
    }

    public void removeTesters(int id){
        testers.removeIf(p-> p.id==id);//id si, yazacağımız id ye eşit olanı tutmak için.üste parantez içine mutlaka argument yazılmalı
    }

    public void addDeveloper(Developer_4 developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer_4[]developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDevelopers(int id) {
        developers.removeIf(p -> p.id == id);
    }

    public String toString() {
        return "ScrumTeam_8{" +
                "PO=" + PO.name +//nameler manuel
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +//number of ve size() lar manuel(çünkü toplam tester sayısını istiyoruz)
                ", number of developers=" + developers.size() +//number of ve size() lar manuel(çünkü toplam develoepr sayısını istiyoruz)
                '}';
    }
}
/*
Variables:
PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
testers (ArrayList<Testers>),  developers (ArrayList<Developers>)
Methods:
addTester(Tester tester): adds the given tester to testers arraylist
ddTesters(Tester[] testers): adds the given testers to testers arraylist
removeTester(int id): removes the tester with the given id from the arraylist of tester
addDeveloper(Developer developer): adds the given developer to testers arraylist
addDeveloper(Developer[] developer): adds the given developers to testers arraylist
removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
toString(): displays the BA' name, SM'
name, PO' name, number of testers and number of developers
 */
