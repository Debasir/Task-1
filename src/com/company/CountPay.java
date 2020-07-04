package com.company;

public class CountPay {
    public static double annuityPayCounter(double percentRate, double loanAmount, double loanMounts) {
        double payInMounth;
        double annuityRate;
        percentRate /= 12;
        annuityRate = percentRate * ((Math.pow((1 + percentRate), loanMounts)) / (Math.pow((1 + percentRate), loanMounts) - 1));
        payInMounth = annuityRate * loanAmount;
//     System.out.printf("%.2f", payInMounth);
        return payInMounth;
    }

    public static double differentiatedPayCounter(double percentRate, double loanAmount, double loanMounts, int n, double loanBodyPay) {
        double payInMonth = 0;
        while ((n <= loanMounts)) {
            n++;
            double nowPaySum = (loanAmount * percentRate) / loanMounts;
            return loanBodyPay + nowPaySum;
        }
        return payInMonth;
    }
}

//    public static void differentiatedPayInMounth(double percentRate, double loanAmount, double loanMounts) {
//        double nowPaySum;
//        int n = 0;
//        double loanBodyPay = loanAmount / loanMounts;
//        while ((n < loanMounts)) {
//            n++;
//            nowPaySum = (loanAmount * percentRate) / loanMounts;
//            System.out.println("Выплата в " + n + " месяц");
//            System.out.printf("%.2f", loanBodyPay + nowPaySum);
//            System.out.println();
//            loanAmount -= loanBodyPay;
//        }
//    }

