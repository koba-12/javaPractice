package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";

        if (validBrowser){

            if (browserName == "chrome"){
                result = "chrome browser is selected";
            }else if (browserName == "firefox"){
                result = "firefox browser is selected";
            }else if (browserName == "opera"){
                result = "opera browser is selected";
            }else if (browserName == "safari"){
                result = "safari browser is selected";
            }else {
                result = "edge browser is selected";
            }

        }else {
            result = "invalid browser name";
        }
        System.out.println(result);
    }
}
