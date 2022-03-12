import java.util.Scanner;

public class BBTM {
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

    public BBTM(boolean isanimation){
        state = new String[3];
        utm = new UniversalTuringMachine();
        Move left = MoveClassical.LEFT;
        Move right = MoveClassical.RIGHT;
        Move reset = MoveLRTM.RESET;
        Scanner scanner = new Scanner(System.in);
        file_path_str=scanner.nextLine();
        readFile = new ReadFile(file_path_str);
        ruleNumber=readFile.getNumber();
        rule= readFile.getRule();
        for(int i=0;i<readFile.getStates().length;i++){
            state[i]=readFile.getStates()[i];
        }
        turingMachine=new TuringMachine(ruleNumber,state[0],state[1],"states[2]");
        aRule=new LoadRules(turingMachine,rule,left,right,reset);
        if(isanimation){car=new Driver(turingMachine,utm,"00000000000000000000",left,right,true);}
        else{car=new Driver(turingMachine,utm,"00000000000000000000",left,right,false);}
    }
}
