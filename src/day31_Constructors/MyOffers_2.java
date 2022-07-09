package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers_2 {

    public static void main(String[] args) {

        Offer_1 offer1=new Offer_1();
        offer1.setInfo("VA","amazon Inc.","SDET",110000,true,true,true);

        Offer_1 offer2=new Offer_1();
        offer2.setInfo("CA","sony Inc.","QA",120000,true,false,false);

        Offer_1 offer3=new Offer_1();
        offer3.setInfo("Fl","apple Inc.","QE",125000,true,true,true);

        Offer_1 offer4=new Offer_1();
        offer4.setInfo("TX","capital one","SM",115000,false,false,true);

        Offer_1 offer5=new Offer_1();
        offer5.setInfo("WA","bank of america","BA",130000,true,true,false);


        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);


        //şimdi burada full time da yazmam lazımdı üstte ama bir karışıklık oldu onu çıkardım.
        //full timela ilgili arraylist kodları yazılacak ama ben ellemiyorum.


        Offer_1[]myOffers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer_1>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!p.location.equals("VA"));//teklif yerel alandan değilse teklifi kaldırır

        System.out.println(localOffers.size());//1
        //not:bu taskin devamı var lütfen yapalım(class notesta sanırım)

        for (Offer_1 localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+ localOffer.salary);//local offera uygun şirketi ve maasşını görüntülemiş olduk
        }

    }
}
