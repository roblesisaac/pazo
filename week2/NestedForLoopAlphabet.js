public class MyClass {
    public static void main(String args[]) {
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String message = "";
        for(int count=0; count<7; count++) {
          message += alpha[count];
          System.out.println(message);
        }
    }
}
