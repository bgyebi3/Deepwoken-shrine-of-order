import java.util.Scanner;
import java.util.Random;

public class shriner {
    public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);

            int str;
            int fort;
            int agil;
            int will;
            int isma;
            int intel;
            int ele;
            int wep;

                System.out.println("shrine of order -- ");
                    System.out.println("enter the strength");
                    str = scan.nextInt();
                    System.out.println("enter the fortitude");
                    fort = scan.nextInt();
                    System.out.println("enter the agility");
                    agil = scan.nextInt();
                    System.out.println("enter the will");
                    will = scan.nextInt();
                    System.out.println("enter the intel");
                    intel = scan.nextInt();
                    System.out.println("enter the charisma");
                    isma = scan.nextInt();
                    System.out.println("enter the element");
                    ele = scan.nextInt();
                    System.out.println("enter the wep");
                    wep = scan.nextInt();


                       shrineoforder shrine = new shrineoforder(str, fort, agil, will, intel, isma, ele, wep);
                String x = "";
                System.out.println("Do you want to shrne?");
                    if(x.equalsIgnoreCase("yes")) {
                            shrine.check();
                            shrine.shrine();
                    }
                    else
                            while(!x.equals("done")){
                            x = "";
                        System.out.println("Which stat are you chaing");
                                if(x.equalsIgnoreCase("strength") || x.equalsIgnoreCase("fortitude") || x.equalsIgnoreCase("agility") || x.equalsIgnoreCase("willpower") || x.equalsIgnoreCase("intel") || x.equalsIgnoreCase("charisma") || x.equalsIgnoreCase("element") || x.equalsIgnoreCase("wep")){
                                        System.out.println("enter the new amount");
                                            if(x.equals("strength")){
                                        int str2 = scan.nextInt();
                                        shrine.setstr(str2);
                                        x = "";
                                            }

                             if(x.equalsIgnoreCase("fortitude")){
                                        int fort2 = scan.nextInt();
                                        shrine.setfort(fort2);
                                        x = "";
                                }
                                 if(x.equalsIgnoreCase("agility")){
                                        int agil2 = scan.nextInt();
                                        shrine.setagil(agil2);
                                        x = "";
                            }
                             if(x.equalsIgnoreCase("willpower")){
                                        int will2 = scan.nextInt();
                                        shrine.setwill(will2);
                                        x = "";
                             }
                                         if(x.equalsIgnoreCase("intel")){
                                        int intel2 = scan.nextInt();
                                        shrine.setintel(intel2);
                                        x = "";
                                         }
                                         if(x.equalsIgnoreCase("charisma")){
                                        int isma2 = scan.nextInt();
                                        shrine.setisma(isma2);
                                        x = "";
                                         }
                                          if(x.equalsIgnoreCase("wep")){
                                        int wep1 = scan.nextInt();
                                        shrine.setwep(wep1);
                                        x = "";
                                        }
                                    }
                            System.out.println("Would you want to make another change? tpe done if your done ");
                            x = scan.nextLine();
                            }
                            shrine.check();
                            shrine.shrine();

        System.out.println(shrine.toString());
                        }
}
