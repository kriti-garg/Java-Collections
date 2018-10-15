import java.util.*;
public class CardsPQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,str1;
        str1=null;
        int flag=0;
        str = sc.nextLine();
        char ch[] = str.toCharArray();
        if(ch[0]>46 && ch[0]<54)
            str1 = ch[0];
            else 
            if(ch[0]=='A')
            str1 = "Ace of";
            else if(ch[0] =='J')
            str1 = "Jack of ";
            else if(ch[0]=='Q')
            str1 = "Queen of ";
            else if(ch[0]=='K')
            str1 = "King of ";
           else  flag=1;
        switch(ch[1]){
            case 'S':{
              str1 = str1 + "Spades";
                break;
            }
            case 'C':{
                str1 = str1 + "Clubs";
                break;
            }
            case 'D':{
                System.out.print("Diamonds");
                break;
            }
            case 'H':{
                System.out.print("Hearts");
                break;
            }  
            default:{
                flag=1;
            }
    }
    if(flag==1)
    System.out.print("Invalid");
    }
}