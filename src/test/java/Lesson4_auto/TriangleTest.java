package Lesson4_auto;

import Lesson4_auto.utils.TimingExtention;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(TimingExtention.class)
public class TriangleTest {
    Functions functions = new Functions();
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void beforeAll(){
        logger.info("выполнится перед всем тестовым набором");
    }

    @BeforeEach
    void setUp(){
        logger.info("выполнится перед каждым тестом");
    }

    @Test
    @DisplayName("Проверить, что сумма углов равна 180, фигура является треугольником")
    void testSumAngleTriangleTrue(){
        boolean result = functions.isSumAngleTriangle(40,60,80);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Проверить, что площадь треугольника вычислена верно")
    void AreaTriangleTrue(){
        double result = functions.squareTriangle(3,4,5);
        Assertions.assertEquals(6,6, "Площадь треугольника вычислена верно");
    }

    @Test
    @DisplayName("Проверить, что стороны треугольника больше 0")
    void sidePositiveTrue(){
        boolean result = functions.isSidePositive(3,4,5);
        Assertions.assertTrue(result, "Стороны треугольника больше 0");
    }

    @Test
    @DisplayName("Проверить, что фигура является треугольником")
    void triangleTrue(){
        Assertions.assertTrue(functions.isTriangle(3,4,5), "фигура не является треугольником");
    }

    @AfterEach
    void tearDown(){
        logger.debug("выполнится после каждого теста");
    }

    @AfterAll
    static void afterAll(){
        logger.debug("выполнится после всего тестового набора");
    }
}
