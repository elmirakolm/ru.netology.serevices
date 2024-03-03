package org.example.ru.netology.services.services;
//import org.example.ru.netology.services.services.VacationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculate() {
        VacationService service = new VacationService();

        // Первый пример
        assertEquals(3, service.calculate(10000, 3000, 20000, 0.666));

        // Второй пример
        assertEquals(2, service.calculate(100000, 60000, 150000, 0.666));
    }
}