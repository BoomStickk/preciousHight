import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("FAMILY FELIDAE: \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
        int preciousChoice=in.nextInt();
        while (true){
            checkValidInput(in, "[1234]", "Don't even try who do you think I am,try again I know u can do it:D : ");

        if(preciousChoice==1){

        } else if (preciousChoice==2) {

        } else if (preciousChoice==3) {
            System.out.println("1:The Felinae are a subfamily of the family Felidae. This subfamily comprises the small cats having a bony hyoid, because of which they are able to purr but not roar.\nYou are small :D but you can definitely ROAR.");
            System.out.println("2:The Pantherinae subfamily belongs to the lineage Panthera with five species of the genus Panthera: lion, tiger, leopard, jaguar, and snow leopard, and two species\n of the genus Neofelis: Indochinese clouded leopard and Sunda clouded leopard.\nHere come the big guns, but you are bigger...in a way :D");
            System.out.println("Press enter to continue");
            try{System.in.read();}
            catch(Exception e){}
            System.out.print("FAMILY FELIDAE: \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
             preciousChoice=in.nextInt();
        } else if(preciousChoice==4){
            break;
        }
        }
    }

    private static void checkValidInput(Scanner sc, String pattern, String s) {
        while (!sc.hasNext(pattern)) {
            System.out.print(s);
            sc.next();
        }}}