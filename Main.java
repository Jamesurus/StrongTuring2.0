import java.io.FileReader;
import java.util.Scanner;
public class Main {
    private static BBTM bbturing;
    private static Classical ctm;
    private static LRTM left;
    public static void main(String[] args) throws InterruptedException {
        //boolean isanimation=true;
        //Scanner scanner = new Scanner(System.in);
        //3.关于isAnimated的输入
        /*
        String booleannnn = scanner.next();
        if (booleannnn.equals("--animation")) {
            isanimation = true;
        }else if(booleannnn.equals("-noanimation")){
            isanimation = false;
        }
        */
        /*up 关于boolean输入*/
        bbturing=new BBTM(true);
        //ctm=new Classical(true);
        //left=new LRTM(false);
    }
}