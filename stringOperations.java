import java.util.Scanner;

public class stringOperations {
    static void case_change(String str){
        StringBuffer newStr=new StringBuffer(str);    
            
        for(int i = 0; i < str.length(); i++) {    
            if(Character.isLowerCase(str.charAt(i))) {       
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
            }       
            else if(Character.isUpperCase(str.charAt(i))){       
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }
    static void reverse_string(String str){
        StringBuffer newStr = new StringBuffer(str);
        newStr.reverse();
        System.out.println("String after reversing : "+newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String myString = sc.nextLine();
        case_change(myString);
        reverse_string(myString);
        System.out.print("Enter another String: ");
        String myNewString = sc.nextLine();
        if(myString.equals(myNewString))
            System.out.print(myString+" and "+myNewString+" are Equal");
        else
            System.out.print(myString+" and "+myNewString+" are not Equal"); 
        System.out.print("\nString after Concatenation : "+myString.concat(myNewString));
        
        sc.close();
    }
}
