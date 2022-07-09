package day32_Constructors;

public class Carpet_1 {

    public double width,length, unitPrice;
    public boolean isPersian;

    public Carpet_1(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice=(width*length)*unitPrice;

        if (isPersian){
            totalPrice+=200;//aşağıda eğer isPersian ise 200 daha pahalı dediğinden bunu yaptık.
            //artık şu += konusu daha net oldu.totalprice=totalprice+200 demek yani eminiz.
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet_1{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total Price= $" + calcCost() +//normalde shortcutı yapınca bu satır olmuyor.bunu biz ekliyoruz.yukarıdaki
                //calcCost gibi method eklediğimiz zaman buradan da eklememiz lazım.UNUTMAYALIM!!!
                '}';
    }
}
/*
1.Carpet Task:
1.1 create a custom class for the Carpet class that
should contain the following:
Attributes:
width, length, unitPrice, isPersian (boolean)
Add a constructor to set all the instances
Actions:
calcCost(): should be able to calculate the total cost of the carpet and return it as double
toString(): should be able to display all the info of
the carpet including the total cost of the carpet as calculated by calcCost()
total price of carpet = (width*length)*unitprice
if the carpet is persian  carpet, add 200$ to the totalPrice
 */
