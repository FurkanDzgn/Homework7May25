package utils;

public class converterClass {

    public converterClass(){

    }

    public static Double value(String str){

        StringBuilder w=new StringBuilder(str.substring(1).trim());

     outher:
     for(int i=0;i<w.length();i++){
            if(!Character.isDigit(w.charAt(i))){
                w.deleteCharAt(i);

                break outher;
            }
        }
        Double x=Double.parseDouble(w.toString());
        return x;
    }
}
