import java.util.Scanner;
public class TextBasedGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Character Name: (NO SPACES PLEASE)");
        String name = scanner.next();
        System.out.println("You are currently against chinese player 鸡鸡, choose what card you want to use.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("鸡鸡 placed a pekka behind his king tower, type 1 to place Skeleton Army, type 2 to place Mega Knight");
        int a = scanner1.nextInt();
        if(a == 1){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Your Skarmy has countered his Pekka, type 1 to place a Hog Rider, type 2 to place down a Lava Hound");
            int b = scanner2.nextInt();
            if(b == 1){
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("You have taken one of 鸡鸡's towers, type 1 to cycle Skeletons (Offensive), type 2 to place a Tesla (defensive)");
                int d = scanner4.nextInt();
                if(d==1){
                    Scanner scanner13 = new Scanner(System.in);
                    System.out.println("Your Hog Rider is back in cycle, type 1 to place it behind your King Tower, type 2 to place it at the bridge");
                    int m = scanner13.nextInt();
                    if(m==1 || m==2){
                        Scanner scanner14 = new Scanner(System.in);
                        System.out.println("You have taken 鸡鸡's King Towers, type 1 to spam HEHEHEHA emote, type 2 to type GGs");
                        int sdf = scanner14.nextInt();
                        System.out.println(name + " has defeated 鸡鸡!");
                    }
                }
                if(d==2){
                    Scanner scanner15 = new Scanner(System.in);
                    System.out.println("You have predicted your opponent's ballon push, type 1 to place a MegaKnight, type 2 to place an Sparky");
                    int n = scanner15.nextInt();
                    if(n==1){
                        Scanner scanner16 = new Scanner(System.in);
                        System.out.println("Your MegaKnight has been defeated by 鸡鸡's Pekka, you have lost 1 tower..., type 1 to Mirror + Clone Goblin Barrels (Troll Move), type 2 to place Hog Rider");
                        int o = scanner16.nextInt();
                        if(o==1){
                            System.out.println("Your 10 elixer has been countered by a log, You've lost your King Tower to 鸡鸡's Lumberjack + Balloon");
                            System.out.println(name + " has been defeated by 鸡鸡!");
                        }
                        if(o==2){
                            Scanner scanner17 = new Scanner(System.in);
                            System.out.println("Your Hog Rider leaves his King Tower at 162 hp, type 1 to FireBall it, type 2 to spam with HEHEHEHA emote");
                            int p = scanner17.nextInt();
                            System.out.println(name + " has defeated 鸡鸡!");
                        }
                    }
                    if(n==2){
                        Scanner scanner18 = new Scanner(System.in);
                        System.out.println("Your Sparky is locked on to an Ice Spirit, 鸡鸡's King Tower is 1 shot, type 1 to Tornado the Ice Spirit, type 2 to place a MegaKnight");
                        int q = scanner18.nextInt();
                        if(q==1){
                            Scanner scanner19 = new Scanner(System.in);
                            System.out.println("You missed your Tornado, 鸡鸡's King Tower is at 1000hp, type 1 to place a Hog Rider, type 2 to Rocket");
                            int r = scanner19.nextInt();
                            if(r==1){
                                Scanner scanner20 = new Scanner(System.in);
                                System.out.println("Your Hog Rider leaves his King Tower at 134 hp, type 1 to Rocket, type 2 to spam with HEHEHEHA emote");
                                int asdf = scanner20.nextInt();
                                System.out.println(name + " has defeated 鸡鸡!");
                            }
                            if(r==2){
                                Scanner scanner9 = new Scanner(System.in);
                                System.out.println("Your MegaKnight leaves his King Tower at 154 hp, type 1 to Cycle to Another Rocket, type 2 to spam with HEHEHEHA emote");
                                int i = scanner9.nextInt();
                                System.out.println(name + " has defeated 鸡鸡!");
                            }
                            if(q==2){
                                Scanner scanner9 = new Scanner(System.in);
                                System.out.println("Your MegaKnight leaves his King Tower at 154 hp, type 1 to FireBall it, type 2 to spam with HEHEHEHA emote");
                                int i = scanner9.nextInt();
                                System.out.println(name + " has defeated 鸡鸡!");
                            }
                        }
                    }
                }
            }
            if(b==2){
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("Your Lava Hound is getting flamed by an Inferno Tower, type 1 to place an E-wiz, type 2 to Zap the Inferno Tower");
                int e = scanner5.nextInt();
                if(e==1 || e==2){
                    Scanner scanner201 = new Scanner(System.in);
                    System.out.println("Your opponent has rage quited the game, type 1 to spam HEHEHEA, type 2 to spam your cards at the bridge");
                    int sdfsd = scanner201.nextInt();
                    System.out.println(name + " has defeated 鸡鸡!");
                }
            }

        }
        if(a==2){
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Your MegaKnight has been defeated, you are currently down a tower... type 1 to place an Xbow, type 2 to place a Knight with Archers");
            int c = scanner3.nextInt();
            if(c==1){
                Scanner scanner6 = new Scanner(System.in);
                System.out.println("You Xbow is defended with an Ice Golem, type 1 to tornado the Ice Golem, type 2 to Fire Ball the Ice Golem");
                int f = scanner6.nextInt();
                if(f==1 || f==2){
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("Your Xbow locked on, You are currently in a good position, type 1 to place your MegaKnight, type 2 to place your Evolution Knight");
                    int h = scanner8.nextInt();
                    if(h==1){
                        Scanner scanner9 = new Scanner(System.in);
                        System.out.println("Your MegaKnight leaves his King Tower at 154 hp, type 1 to FireBall it, type 2 to spam with HEHEHEHA emote");
                        int i = scanner9.nextInt();
                        System.out.println(name + " has defeated 鸡鸡!");
                    }
                    if(h==2){
                        Scanner scanner10 = new Scanner(System.in);
                        System.out.println("Your Evo-Knight is tanking every attack, type 1 to place your MegaKnight, type 2 to place your archers");
                        int j = scanner10.nextInt();
                        if(j==1){
                            Scanner scanner11 = new Scanner(System.in);
                            System.out.println("Your MegaKnight, along with your Evo-Knight has taken the opponent's King tower, type 1 to spam HEHEHEHA, type 2 to GG");
                            int k = scanner11.nextInt();
                            System.out.println(name + " has defeated 鸡鸡");
                        }
                        if(j==2){
                            Scanner scanner12 = new Scanner(System.in);
                            System.out.println("Your Archers along with your Evo-Knight has left the King tower at 134 hp, type 1 to FireBall it, type 2 to spam with HEHEHEHA emote");
                            int l = scanner12.nextInt();
                            System.out.println(name + " has defeated 鸡鸡!");
                        }
                    }
                }
            }
            if (c==2) {
                Scanner scanner7 = new Scanner(System.in);
                System.out.println("You're push is defended by an E-Giant, type 1 to Rocket the E-Giant, type 2 to give up and spam HEHEHEHA");
                int g = scanner7.nextInt();
                if(g==1){
                    System.out.println("The E-Giant ends up leaving your King Tower at 145 hp, 鸡鸡 throws out a FireBall + spams Skeleton Crying emote...");
                    System.out.println(name + " has been defeated by 鸡鸡!");
                }
                if(g==2){
                    System.out.println("鸡鸡 spams: 'well played!' You have been humilated...");
                    System.out.println(name + " has been defeated by 鸡鸡!");
                }
            }
        }
        System.out.println("Thank You For Playing <3");
    }


}
