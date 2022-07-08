import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ");
        int preciousChoice;
        validateInput(in, "[1234]", "Who do you think I am(1234): ");
        preciousChoice = in.nextInt();
        String preciousChoice2;
        String preciousChoiceYN;
        int preciousChoice3;
        int yetAnotherPreciousChoice;
        double yourHeight = 1.65;
        double result;
        int exitCounter = 0;
        int helpCounter = 0;
        while (true) {
            if (preciousChoice == 1 && helpCounter > 0) {
                System.out.println("Choose: \n1:Genus Felis (domestic cat)\n2:Genus Puma\n3:Back");
                validateInput(in, "[123]", "Please try harder next time(123): ");
                preciousChoice3 = in.nextInt();
                if (preciousChoice3 == 1) {
                    System.out.println("Average domestic height is about 25sm");
                    result = yourHeight / 0.25;
                    System.out.println("So I guess you are about " + String.format("%.2f", result) + " little puffy cats tall\n Not much at all :D , but cute enough i'd sey. ");
                    enterToContinue();
                } else if (preciousChoice3 == 2) {
                    System.out.println("Average Puma height is 60-75");
                    result = yourHeight / 0.675;
                    System.out.println("So I guess you are about " + String.format("%.2f", result) + " scary pumas tall\nAlthough you can't scare me...no you can't I am pretty sure about that...I think\n ok GO GO");
                    enterToContinue();
                } else if (preciousChoice3 == 3) {
                    preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ", in);
                }
            } else if (preciousChoice == 2 && helpCounter > 0) {
                System.out.println("====================================================================================");
                System.out.println("Choose big cat family: \n1:Genus Panthera (big, or roaring, cats)\n2:Some of the rest I taught are graceful as you\n3:Back");
                validateInput(in, "[123]", "A different error message everywhere,I am starting to defunnyfy(new word :D)(123): ");
                yetAnotherPreciousChoice = in.nextInt();
                if (yetAnotherPreciousChoice == 1) {
                    System.out.println("Just choose tiger or lion, thought I envision you as more of a lioness :D, after all you are a LEO right");
                    preciousChoice2 = in.next();
                    switch (preciousChoice2) {
                        case "lion" -> {
                            System.out.println("Average lion height is 90-110");
                            result = yourHeight;
                            System.out.println("So I guess you are about " + String.format("%.2f", result) + " big hungry cats tall\nIf they eat as much as you they might die of THIRST :D\nTrying to be funny hope it works.");
                            enterToContinue();
                            preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ", in);
                            continue;
                        }
                        case "tiger" -> {
                            System.out.println("Average tiger height is 80-110");
                            result = yourHeight / 0.95;
                            System.out.println("So I guess you are about " + String.format("%.2f", result) + " great striped cats tall\nI guess the stripes are for camo but you can't really hide with those eyes.");
                            enterToContinue();
                            preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ", in);
                            continue;
                        }
                        case "LEO" -> {
                            result = yourHeight / 1.77;
                            System.out.println("You found my secret menu,good job.\nOr did you data-mined it? Well even if so, it wouldn't have been easy so here's a treat :)");
                            System.out.println("   |\\---/|\n   | ,_, |\n    \\_`_/-..----.\n ___/ `   ' ,\"\"+ \\ \n(__...'   __\\    |`.___.';\n  (_,...'(_,.`__)/'.....+");
                            System.out.println("Well I'm 1.77(above average) witch means I am 12sm higher than you :D\nThat makes you " + String.format("%.2f", result) + " fun guys tall.\nThat means you are SHORT :D and yet you are very ELEGANT and BEAUTIFUL.\nI guess that works for your daily beauty confirmation <3\nHope you had fun. ");
                        }
                        default -> System.out.println("May be you are close, try again");
                    }
                    break;

                } else if (yetAnotherPreciousChoice == 2) {
                    System.out.println("choose 1 of those:\n1:Marbled cat\n2:Snow leopard");
                    validateInput(in, "[12]", "You should see a picture of the marbled cat, so cute(almost as much as you)(12): ");
                    preciousChoice = in.nextInt();
                    if (preciousChoice == 1) {
                        System.out.println("Average marbled cat height is 30");
                        result = yourHeight / 0.3;
                        System.out.println("So I guess you are about " + String.format("%.2f", result) + " little cute cats tall\nWell bit bigger than the domestic ones, but a bit wilder too, like someone I know");
                        enterToContinue();

                    } else if (preciousChoice == 2) {
                        System.out.println("Average snow leopard height is 60");
                        result = yourHeight / 0.6;
                        System.out.println("So I guess you are about " + String.format("%.2f", result) + " cold cats tall\nWith so little body fat you must get cold during the winter months\nYou definitely need something or someone to keep you warm :D");
                        enterToContinue();
                    }
                } else if (yetAnotherPreciousChoice == 3) {
                    preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit\n ", in);
                }
            } else if (preciousChoice == 3) {
                System.out.println("====================================================================================");
                if(helpCounter>0){
                System.out.println("I guess you need more help than I thought\nI will spell it out for you, LEO is the answer");
                enterToContinue();
                    preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);
                continue;
                }
                helpCounter++;
                System.out.println("\n1:The Felinae are a subfamily of the family Felidae. This subfamily comprises the small cats having a bony hyoid, because of which they are able to purr but not roar.\nYou are small :D but you can definitely ROAR.");
                System.out.println("2:The Pantherinae subfamily belongs to the lineage Panthera with five species of the genus Panthera: lion, tiger, leopard, jaguar, and snow leopard, and two species\n of the genus Neofelis: Indochinese clouded leopard and Sunda clouded leopard.\nHere come the big guns, but you are bigger...in a way :D");
                enterToContinue();
                preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);
            } else if (preciousChoice == 4 && helpCounter > 0) {
                System.out.println("====================================================================================");
                exitCounter++;
                switch (exitCounter) {
                    case 1 -> {
                        System.out.print("Are you sure you want to exit: ");

                        validateInput(in, "[yn]", "No way I would fail here(y-n): ");
                        preciousChoiceYN = in.next();
                        if (preciousChoiceYN.equals("y")) {
                            continue;
                        } else if (preciousChoiceYN.equals("n")) {
                            preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);

                        }
                        continue;
                    }
                    case 2 -> {
                        System.out.print("I will be fun and tell you, you should continue...or may by you cant be bothered anymore ?: ");
                        validateInput(in, "[yn]", "Really, concentrate pls(y-n): ");
                        preciousChoiceYN = in.next();
                        if (preciousChoiceYN.equals("y")) {
                            continue;
                        } else if (preciousChoiceYN.equals("n")) {
                            preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);

                        }
                        continue;
                    }
                    case 3 -> {
                        System.out.print("please don't exit Im sure there is something you are missing...got to go?: ");
                        validateInput(in, "[yn]", "Are you just trying to read the error message, that's so metta(y-n) ");
                        preciousChoiceYN = in.next();
                        if (preciousChoiceYN.equals("y")) {
                            continue;
                        } else if (preciousChoiceYN.equals("n")) {
                            preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);

                        }
                        continue;
                    }
                    case 4 -> {
                        System.out.print("You are definitely a LEO you can't be reasoned with(may be I left a hint around here)...still want to leave: ");
                        validateInput(in, "[yn]", "May be I should make those error messages funny or something(y-n)");
                        preciousChoiceYN = in.next();
                        if (preciousChoiceYN.equals("y")) {
                            continue;
                        } else if (preciousChoiceYN.equals("n")) {
                            preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);

                        }
                        continue;
                    }
                    case 5 -> System.out.print("OK OK I guess you are done, hope you had fun");
                }
                break;


            } else {
                System.out.println("====================================================================================");
                System.out.println("Wait wait go to help first, you will need it :D");
                enterToContinue();
                preciousChoice = getPreciousChoice("FAMILY FELIDAE(This mean cats I guess): \nChoose subfamily: \n1:Subfamily Felinae\n2:Subfamily Pantherinae\n3:Help\n4:Exit ", in);
            }
        }
    }

    private static void enterToContinue() {
        System.out.println();
        System.out.println("Press enter to continue");
        try {

            //noinspection ResultOfMethodCallIgnored
            System.in.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void validateInput(Scanner in, String pattern, String x) {
        while (!in.hasNext(pattern)) {
            System.out.println(x);
            in.next();
        }
    }

    private static int getPreciousChoice(String s, Scanner in) {
        System.out.print(s);
        validateInput(in, "[1234]", "Who do you think I am(1234): ");
        return in.nextInt();
    }

}