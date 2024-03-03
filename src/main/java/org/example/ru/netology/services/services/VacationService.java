package org.example.ru.netology.services.services;
public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int monthsOfRest = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                monthsOfRest++; // увеличиваем счетчик месяцев отдыха
                money -= expenses; // уменьшаем деньги на обязательные расходы
                money -= expenses * 3; // уменьшаем деньги на траты на отдых
            } else {
                money += income - expenses; // прибавляем доход и вычитаем расходы
            }
        }

        return monthsOfRest;
    }
}