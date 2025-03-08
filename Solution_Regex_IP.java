import java.util.Scanner;

class Solution_Regex_IP {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}


//Write your code here
class MyRegex{
    String from255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    String pattern = String.format("%s.%s.%s.%s", from255, from255, from255, from255);
}
