package org.example.ru.netology.services.services;
public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        double percentageExpenses = 0.666;
        int monthsOfRest = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money += income; // прибавляем деньги зарплату
                money -= expenses;
            } else {
                monthsOfRest++; // увеличиваем счетчик месяцев отдыха
                money -= expenses;
                double additionalExpenses = money * percentageExpenses;
                money -= (int)additionalExpenses;
            }
        }

        return monthsOfRest;
    }


}

