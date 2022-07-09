package day31_Constructors.scrumTask;

public class MyScrumTeam_4 {

    public static void main(String[] args) {

        //4 testers objects

        Tester_1 tester1=new Tester_1("layan",11,"qa",110000);
        Tester_1 tester2=new Tester_1("ali",43,"sdet",120000);
        Tester_1 tester3=new Tester_1("alex",44,"se",135000);
        Tester_1 tester4=new Tester_1("lala",23,"sdet",115000);
//diğer tasklerdeki gibi yine bunları yazdık.
//3.clastta yazdığım public void addTester(Tester_1 tester) ve aynısının developerı olan bunun içindi
        Tester_1[]testers={tester2,tester3,tester4};
//yine 3.clastta yazdığım public void addTesters(Tester_1[]testers) ve aynısının developerlı olanı da bunun içindi
        //tabi developer aşağıdaki developerlar için


        //4 developers objects

        Developer_2 developer1=new Developer_2("olga",22,"java developer",110000);
        Developer_2 developer2=new Developer_2("aygün",39,"java master",185000);
        Developer_2 developer3=new Developer_2("tunç",28,"software developer",135000);
        Developer_2 developer4=new Developer_2("sinem",13,"senior developer",200000);

        Developer_2[]developers={developer2,developer3,developer4};

        //1 scrum team object

        ScrumTeam_3 scrum=new ScrumTeam_3("nigara","hüseyin","neira",14);
        scrum.addTester(tester1);//bu 4 satırdaki kodlarla scrumteame tester ve developer ekledik
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);//ScrumTeam_3{PO='nigara', BA='hüseyin', SM='neira', total number of testers=4, total number of developers=4, daysOfSprint=14}


        System.out.println("-----------------------------------------------------------");

        for (Tester_1 eachTester : scrum.testersList){
            System.out.println(eachTester.name+ " : "+ eachTester.salary);
        }
//bu iki loopla tester ve developerı looplayıp name ve salaryleri eşledik.
        for (Developer_2 eachdeveloper : scrum.devopsList){
            System.out.println(eachdeveloper.name + " : " + eachdeveloper.salary);
        }

        System.out.println("---------------------------------------------------------");

//scrum teamin toplam kümesi aşağıdaki gibidir
//ScrumTeam_3{PO='nigara', BA='hüseyin', SM='neira', total number of testers=4, total number of developers=4, daysOfSprint=14}

        scrum.removeTester(23);//buraya employeeID yazarak istediğimiz testerı yahut alttakinden de istediğimiz
        //developerı remove ediyoruz.(önceki classta yazdığımız removeIf method sayesinde

        scrum.removeDeveloper(22);

    }
}
/*
create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
