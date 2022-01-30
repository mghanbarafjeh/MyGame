public class ReverseString {
    private String a;

    public ReverseString(String s){
        a=s;
    }

    public String reverseIt(){
        String temp="";
        for (int i=a.length()-1; i>=0; i--){
            temp += a.toLowerCase().charAt(i);
        }
        return temp;
    }
    public static void main(String[] args){
        ReverseString s = new ReverseString("Milad Afjehee");
        System.out.println(s.reverseIt());
    }

}
