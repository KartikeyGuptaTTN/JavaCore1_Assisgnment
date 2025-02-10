import java.util.*;
class Vowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char ch = sc.next().charAt(0);
        if(((int)(ch)>=65 && (int)(ch)<91) || ((int)(ch)>=97 && (int)(ch)<123)){
        switch (ch) {
            case 'a':
                System.out.println(ch+" is a vowel");
                break;
            case 'e':
                System.out.println(ch+" is a vowel");
                break;
            case 'i':
                System.out.println(ch+" is a vowel");
                break;
            case 'o':
                System.out.println(ch+" is a vowel");
                break;
            case 'u':
                System.out.println(ch+" is a vowel");
                break;
            default:
                System.out.println(ch+" is a consonant");
                break;
        }
    }
    else{
        System.out.println(ch+" is a neither a consonant nor vowel");
    }
    sc.close();
}
}