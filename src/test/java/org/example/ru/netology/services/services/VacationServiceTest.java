package org.example.ru.netology.services.services;
//import org.example.ru.netology.services.services.VacationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculate() {
        VacationService service = new VacationService();

        // Первый пример
        assertEquals(3, service.calculate(10_000, 3_000, 20_000));

        // Второй пример
        assertEquals(2, service.calculate(100_000, 60_000, 150_000));
    }
}