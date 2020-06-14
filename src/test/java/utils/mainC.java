package utils;


public class mainC {
    public static void main(String[] args) {
     //   converterClass cc=new converterClass();

    //    System.out.println(cc.value("$19,22"));

        String str="$19,2200";
        StringBuilder w=new StringBuilder(str.substring(1).trim());

        String res="";
        outher:
        for(int i=0;i<w.length();i++){
            if(!Character.isDigit(w.charAt(i))){
                w.deleteCharAt(i);
                w.insert(i,'.');
                res+=""+w.charAt(i);
                continue outher;
            }

            res+=""+w.charAt(i);

        }
        Double x=Double.parseDouble(res);
        System.out.println(res);

    }
}
