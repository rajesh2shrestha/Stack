import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        String s = "hello";
        char[] ch = s.toCharArray();
        System.out.println(ch);

        //USING STACK
        Stack<Character> chReverse = new Stack<>();
        for(int i = 0; i < ch.length; i++){
            chReverse.push(ch[i]);
        }
        System.out.println(chReverse);

        String rev = "";
        while(!chReverse.isEmpty()){
            rev = rev + chReverse.pop();

        }
        System.out.println(rev);

        //USING REGULAR FOR LOOP
        String reverse = "";
        for(int i = ch.length -1 ; i >= 0; i--){
            reverse = reverse + ch[i];
        }
        System.out.println("The reverse of hello is::" + reverse);
    }
}
