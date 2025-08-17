



public class SkipCharacter{

    public static StringBuffer ans= new StringBuffer();
    public static void main(String[] args){
        String str= "bcadabm";

        // System.out.println("Before: "+ str);
        // skipCharacter(str, 'a');

        // System.out.println("After: "+ ans);

        System.out.println("Before: "+ str);
        skipCharacter(str, 'a');

        System.out.println("After: "+ skipChar(str, 'b'));
    }


    // void function 
    public static void skipCharacter(String str, char chr){
        if(str.length()<=0)
            return;
        
        if(str.charAt(0)==chr){
            skipCharacter(str.substring(1,str.length()), chr);
        }else{
            ans.append(str.charAt(0));
            skipCharacter(str.substring(1,str.length()), chr);

        }
    }


    // returns string
    public static String skipChar(String str, char chr){
        if(str.isEmpty())
            return "";
        
        if(str.charAt(0)==chr){
            return skipChar(str.substring(1), chr);
        }
            ans.append(str.charAt(0));
            return str.charAt(0) + skipChar(str.substring(1), chr);

        
    }
}