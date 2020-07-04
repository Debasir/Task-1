package com.company;

public class Main {

    public static void main(String[] args) {
        inData();
    }

    public static void inData() {
        System.out.println("Укажите сумму кредита");
       double loanAmount = CheckInputType.checkDouble();
        System.out.println("Укажите процентную ставку");
        double percentRate = CheckInputType.checkDouble();
        percentRate /= 100;
        System.out.println("Укажите срок кредита в месяцах");
        double loanMounts = CheckInputType.checInt();
        while (loanMounts > 360) {
            System.out.println("Превышен максимальный срок кредитования, повторите попытку");
            loanMounts = CheckInputType.checkDouble();
        }
        System.out.println("Введите тип платежа (аннуитетный/дифференцированный)");
        String payType = CheckInputType.checkStr("а", "д");
        ;
        if (payType.equalsIgnoreCase("аннуитетный")) {
            System.out.println("Ежемесячная выплата");
            System.out.printf("%.2f", (CountPay.annuityPayCounter(percentRate, loanAmount, loanMounts)));
        }
        if (payType.equalsIgnoreCase("дифференцированный")) {
            int n = 0;
            double loan = loanAmount;
               double loanBodyPay = loan / loanMounts;
            while ((n < loanMounts)) {
                n++;
                System.out.println("Выплата в " + n + " месяц");
                System.out.printf("%.2f", (CountPay.differentiatedPayCounter(percentRate, loanAmount, loanMounts, n, loanBodyPay)));
                System.out.println();
                        loanAmount -= loanBodyPay;
            }
        }
    }
}


