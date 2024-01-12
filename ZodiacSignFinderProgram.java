import java.util.Scanner;

public class ZodiacSignFinderProgram {

    public static void main(String []args){

        int day, month;


        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your birthday month: ");
        month = inp.nextInt();

        System.out.print("Enter your birthday day: ");
        day = inp.nextInt();

        if (month >=1 && month <=12) {
            if (month == 1) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 22) {
                        System.out.println("Capricorn(Oğlak Burcu)");
                    } else {
                        System.out.println("Aquarius(Kova Burcu)");
                    }
                }


            }
            if (month == 2) {
                if ((day >= 1 && day <= 28)) {
                    if (day < 20) {
                        System.out.println("Aquarius(Kova Burcu)");
                    } else {
                        System.out.println("Pisces(Balık Burcu)");
                    }
                }
            }
            if (month == 3) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 21) {
                        System.out.println("Pisces(Balık Burcu)");
                    } else {
                        System.out.println("Aries (Koç Burcu)");
                    }
                }
            }
            if (month == 4) {
                if ((day >= 1 && day <= 30)) {
                    if (day < 20) {
                        System.out.println("Aries (Koç Burcu)");
                    } else {
                        System.out.println("Taurus(Boğa Burcu)");
                    }
                }
            }
            if (month == 5) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 22) {
                        System.out.println("Taurus(Boğa Burcu)");
                    } else {
                        System.out.println("Gemini(İkizler Burcu)");
                    }
                }
            }
            if (month == 6) {
                if ((day >= 1 && day <= 30)) {
                    if (day < 23) {
                        System.out.println("Gemini(İkizler Burcu)");
                    } else {
                        System.out.println("Cancer(Yengeç Burcu)");
                    }
                }
            }
            if (month == 7) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        System.out.println("Cancer(Yengeç Burcu)");
                    } else {
                        System.out.println("Leo(Aslan) Burcu)");
                    }
                }
            }
            if (month == 8) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        System.out.println("Leo(Aslan) Burcu)");
                    } else {
                        System.out.println("Virgo(Başak Burcu)");
                    }
                }
            }
            if (month == 9) {
                if ((day >= 1 && day <= 30)) {
                    if (day < 23) {
                        System.out.println("Virgo(Başak Burcu)");
                    } else {
                        System.out.println("Libra(Terazi Burcu)");
                    }
                }
            }
            if (month == 10) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        System.out.println("Libra(Terazi Burcu)");
                    } else {
                        System.out.println("Scorpio(Akrep Burcu)");
                    }
                }
            }
            if (month == 11) {
                if ((day >= 1 && day <= 30)) {
                    if (day < 22) {
                        System.out.println("Scorpio(Akrep Burcu)");
                    } else {
                        System.out.println("Sagittarius(Yay Burcu)");
                    }
                }
            }
            if (month == 12) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 22) {
                        System.out.println("Sagittarius(Yay Burcu)");
                    } else {
                        System.out.println("Capricorn(Oğlak Burcu)");
                    }
                }
            }

        }    // first if

            else {
            System.out.println("Invalid month");
        }

    }
}
