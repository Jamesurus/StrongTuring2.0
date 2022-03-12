import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    private String file_path;
    private String rule;
    private static String[] states;//得到states数组长度可能2 or 3
    private int number;
    private int i;

    public ReadFile(String file_path) {
        number=0;
        i=0;
        states =new String[3];
        try (Scanner sc = new Scanner(new FileReader(file_path))) {
            while (sc.hasNextLine()) {
                String str1 = sc.nextLine();//将读取到的存到字符串数组里
                if(!str1.contains("#") && str1.contains("rules"))
                {
                    rule=str1.split("=")[1];
                    number=rule.split("<>").length;
                }else if(!str1.contains("#") && str1.contains("State")){
                    String[] str2 = str1.split("=");//新建对象的时候就有了
                    states[i]=str2[1];
                    i++;
                }
            }
        }catch (Exception e) {}
    }
    public int getNumber(){
        return number;//规则组合数
    }
    public String[] getStates(){
        return states;
    }
    public String getRule(){
        return rule;
    }
}
