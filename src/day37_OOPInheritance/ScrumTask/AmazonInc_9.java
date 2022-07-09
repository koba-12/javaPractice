package day37_OOPInheritance.ScrumTask;

public class AmazonInc_9 {

    public static void main(String[] args) {

        String company="Amazon Inc.";//companyi sabitlemek ve shortcut için

        ProductOwner_7 po=new ProductOwner_7("suhaib",29,'M',1,160000,company);

        BusinessAnalyst_6 ba=new BusinessAnalyst_6("cihad",30,'M',2,150000,company);

        ScrumMaster_5 sm=new ScrumMaster_5("anel",26,'F',3,145000,company);


        Tester_3 tester1=new Tester_3("chinara",32,'F',"qa",1415,12500,company);
        Tester_3 tester2=new Tester_3("yasaman",31,'F',"qe",1416,130000,company);
        Tester_3 tester3=new Tester_3("irena",29,'F',"sdet",1417,128000,company);
        Tester_3 tester4=new Tester_3("cüneyt",25,'M',"qa",1418,125000,company);
        Tester_3[]testers={tester1,tester2,tester3,tester4};//üsttekilerin hepsi zaten Tester-3 dan gelme(özellikler)
        //biz de şimdi burada özelliklere isim vs atayıp sonra da scrumMaster da oluşturduğumuz Tester_3 arraylistine ekledik.


        Developer_4 developer1=new Developer_4("daniela",27,'F',"java developer",8,135000,company);
        //üstteki gibi de yapıp,arrayListe ekleyebiliriz,uzamasın diye yapmadım


        ScrumTeam_8 scrumteam=new ScrumTeam_8(po,ba,sm);
        scrumteam.addDeveloper(developer1);//burada spesifik developer1 seçtik sadece çünkü bunu arraye eklememiştik
        scrumteam.addTesters(testers);//burada array olan testersı seçtil ve bu sayede üstte arraye eklediğimiz tüm testerlar in oldu.

        System.out.println(scrumteam);//ScrumTeam_8{PO=suhaib, BA=cihad, SM=anel, number of testers=4, number of developers=1}


        System.out.println("-------------------------------------------------");

        for (Tester_3 tester : scrumteam.testers) {
            System.out.println(tester.name);// bunu yazmadan outa üstteki soutun yanındaki çıkar sadece
            //ama bu şekilde testers ı loopa alarak yarattığım tester objectlerdeki gibi testerlar tüm özellikleriyle
            //birlikte yazar,öyle out olur
            //Employee_2{jobTitle='qa', id=1415, salary=12500.0, companyName='Amazon Inc.', name='chinara', age=32, gender=F} gibi
            //nameden değil jobtitledan başlama sebebi de Employee classta tostring methodda o şekilde yazılı olduğu için.
            //o şekilde yazılı olmasının sebebi de person classın subclassı olduğu için methodu seçerken önceliği superclasstakilere
            //vermesidir.employee classtaki toString methodda yerlerini değiştirerek istediğimiz sıralamayı sağşayabiliriz.
        }

        System.out.println("----------------------------------------------------");

        for (Tester_3 tester : scrumteam.testers) {
            System.out.println(tester.name+" : "+tester.salary);//bu şekilde de testerların isimleri:ve salaryleri out olur.
            //chinara : 12500.0 ... gibi
        }
    }
}
