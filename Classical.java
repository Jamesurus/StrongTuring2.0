import java.util.Scanner;

public class Classical {
    private TuringMachine turingMachine;
    private ReadFile readFile;
    private String file_path_str;
    private LoadRules aRule;
    private int ruleNumber;
    private String[] state;
    private String rule;
    private Move left,right,reset;
    private Driver car;
    private UniversalTuringMachine utm;
    private boolean isanimation;
    private String theTape;

    public Classical(boolean isanimation){
        state=new String[3];
        utm = new UniversalTuringMachine();
        Move left = MoveClassical.LEFT;
        Move right = MoveClassical.RIGHT;
        Move reset = MoveLRTM.RESET;
        Scanner scanner = new Scanner(System.in);
        file_path_str=scanner.nextLine();
        theTape=scanner.nextLine();
        readFile = new ReadFile(file_path_str);
        ruleNumber=readFile.getNumber();
        rule= readFile.getRule();
        for(int i=0;i<3;i++){
            state[i]=readFile.getStates()[i];
        }
        turingMachine=new TuringMachine(ruleNumber,state[0],state[1],state[2]);
        aRule=new LoadRules(turingMachine,rule,left,right,reset);
        while(theTape.length()<20){
            theTape=theTape+"*";
        }
        if(theTape.length()>=20){
            theTape=theTape.substring(0,19);//截取0-19
            theTape=theTape+"*";
        }
        if(isanimation){car=new Driver(turingMachine,utm,theTape,left,right,true);}
        else{car=new Driver(turingMachine,utm,theTape,left,right,false);}
        //需注意20个大小的字符串
    }
}
