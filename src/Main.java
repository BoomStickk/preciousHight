import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ");
        int preciousChoice = in.nextInt();
        String preciousChoice2;
        int preciousChoice3;
        int yetAnotherPreciousChoice;
        double yourHeight = 1.65;
        double result;
        int counter1 = 0;
        int exitCounter = 0;
        while (true) {
            if (preciousChoice == 1) {
                System.out.println("Choose: \n1:Genus Felis (domestic cat)\n2:Genus Puma\n3:Back");
                preciousChoice3 = in.nextInt();
                if (preciousChoice3 == 1) {
                    System.out.println("Average domestic height is about 25sm");
                    result = yourHeight / 0.25;
                    System.out.println("So I guess you are about " + String.format("%.2f", result) + " little puffy cats tall");
                    counter1++;
                    System.out.println("Do you wanna continue having fun: ");
                    preciousChoice2 = in.next();
                    if (preciousChoice2.equals("y")) {
                        System.out.println("OK than");
                        continue;
                    } else if (preciousChoice2.equals("n")) {
                        System.out.println("Did you already see all the stupid stuff I did K than bye later");
                        break;
                    }
                    break;
                } else if (preciousChoice3 == 2) {
                    System.out.println("Average Puma height is 60-75");
                    result = yourHeight / 0.675;
                    System.out.println("So I guess you are about " + String.format("%.2f", result) + " scary pumas tall");
                    System.out.println("Do you wanna continue having fun: ");
                    preciousChoice2 = in.next();
                    if (preciousChoice2.equals("y")) {

                    } else if (preciousChoice2.equals("n")) {
                        System.out.println("Did you already see all the stupid stuff I did K than bye later");
                        break;
                    }
                } else if (preciousChoice3 == 3) {
                    System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ");
                    preciousChoice = in.nextInt();
                }
            } else if (preciousChoice == 2) {
                System.out.println("Choose big cat family: \n1:Genus Panthera (big, or roaring, cats)\n2:Some of the rest I taught are graceful as you\n3:Back");
                yetAnotherPreciousChoice = in.nextInt();
                if (yetAnotherPreciousChoice == 1) {
                    System.out.println("Just choose tiger or lion, thought I envision you as more of a lioness :D");
                    preciousChoice2 = in.next();
                    if (preciousChoice2.equals("lion")) {
                        System.out.println("Average lion height is 90-110");
                        result = yourHeight;
                        System.out.println("So I guess you are about " + String.format("%.2f", result) + " little puffy cats tall");
                        System.out.println("Do you wanna continue having fun: ");
                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                        } else if (preciousChoice2.equals("n")) {
                            System.out.println("Did you already see all the stupid stuff I did K than bye later");
                            break;
                        } else if (preciousChoice2.equals("tiger")) {
                            System.out.println("Average tiger height is 80-110");
                            result = yourHeight / 0.95;
                            System.out.println("So I guess you are about " + String.format("%.2f", result) + " little puffy cats tall");
                            System.out.println("Do you wanna continue having fun: ");
                            preciousChoice2 = in.next();
                            if (preciousChoice2.equals("y")) {

                            } else if (preciousChoice2.equals("n")) {
                                System.out.println("Did you already see all the stupid stuff I did K than bye later");
                                break;
                            }
                        }
                    }
                } else if (yetAnotherPreciousChoice == 2) {
                    System.out.println("choose 1 of those:\n1:Marbled cat\n2:Snow leopard");
                    preciousChoice = in.nextInt();
                    if (preciousChoice == 1) {
                        System.out.println("Average marbled cat height is 30");
                        result = yourHeight / 0.3;
                        System.out.println("So I guess you are about " + String.format("%.2f", result) + " little cute cats tall");
                        System.out.println("Do you wanna continue having fun: ");
                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                        } else if (preciousChoice2.equals("n")) {
                            System.out.println("Did you already see all the stupid stuff I did K than bye later");
                            break;
                        }

                    } else if (preciousChoice == 2) {
                        System.out.println("Average snow leopard height is 60");
                        result = yourHeight / 0.6;
                        System.out.println("So I guess you are about " + String.format("%.2f", result) + " cold cats tall");
                        System.out.println("Do you wanna continue having fun: ");
                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                        } else if (preciousChoice2.equals("n")) {
                            System.out.println("Did you already see all the stupid stuff I did K than bye later");
                            break;
                        }
                    }
                } else if (yetAnotherPreciousChoice == 3) {
                    System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ");
                    preciousChoice = in.nextInt();
                }
            } else if (preciousChoice == 3) {

                System.out.println("\n1:The Felinae are a subfamily of the family Felidae. This subfamily comprises the small cats having a bony hyoid, because of which they are able to purr but not roar.\nYou are small :D but you can definitely ROAR.");
                System.out.println("2:The Pantherinae subfamily belongs to the lineage Panthera with five species of the genus Panthera: lion, tiger, leopard, jaguar, and snow leopard, and two species\n of the genus Neofelis: Indochinese clouded leopard and Sunda clouded leopard.\nHere come the big guns, but you are bigger...in a way :D");
                System.out.println();
                System.out.println("Press enter to continue");
                try {

                    //noinspection ResultOfMethodCallIgnored
                    System.in.read();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
                preciousChoice = in.nextInt();
            } else if (preciousChoice == 4) {
                exitCounter++;
                switch (exitCounter) {
                    case 1:
                        System.out.print("Are you sure you want to exit: ");

                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                            continue;
                        } else if (preciousChoice2.equals("n")) {
                            System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
                            preciousChoice = in.nextInt();

                }continue;

                    case 2:
                        System.out.print("I will be fun and tell you, you should continue...or may by you cant be bothered anymore ?: ");

                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                            continue;
                        } else if (preciousChoice2.equals("n")) {
                            System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
                            preciousChoice = in.nextInt();

                        }continue;
                    case 3:
                        System.out.print("please don't exit Im sure there is something you are missing...got to go?: ");

                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                            continue;
                        } else if (preciousChoice2.equals("n")) {
                            System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
                            preciousChoice = in.nextInt();

                        }continue;
                    case 4:
                        System.out.print("You are definitely a LEO you can't be reasoned with(may be I left a hint around here)...still want to leave: ");

                        preciousChoice2 = in.next();
                        if (preciousChoice2.equals("y")) {
                            continue;
                        } else if (preciousChoice2.equals("n")) {
                            System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ");
                            preciousChoice = in.nextInt();

                        }continue;
                    case 5:
                        System.out.print("OK OK I guess you are done, hope you had fun");
                        break;
                }
                break;


            }
        }
    }

}