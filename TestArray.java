public class TestArray {
    public static void main(String[] args){
        String[] array=new String[3];
        for(int i=0;i<getArray().length;i++){
            array[i]=getArray()[i];
            System.out.println(array[i]);
        }

    }
    public static String[] getArray(){
        String[] array = {"123","fuck","hello"};
        return array;
    }
}
