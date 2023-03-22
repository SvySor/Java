public class Test_code {
    public static void main(String [] args) throws Exception {
        System.out.println("write Capital 'S' for stop loop");
        for (int i = 0, ch; (ch = System.in.read()) !='S'; i++) {
            System.out.println("Pass count of " + i);
            System.out.println("char " + Integer.toHexString(ch));
        }
    } 

}
