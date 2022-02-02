import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void findUniqueWords() {
        var s = """
                РАЗРАБОТКА ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ
                ДЛЯ РОСТА
                ВАШЕГО БИЗНЕСА
                ЛИДЕРЫ В РАЗРАБОТКЕ СОВРЕМЕННЫХ IT-РЕШЕНИЙ НА ЗАКАЗ
                компания по разработке программного обеспечения. С 2001 года мы занимаемся профессиональной разработкой софта на заказ. Наши специалисты оказывают услуги по созданию качественного продукта, отвечающего всем требованиям бизнеса.
                                
                """;
        var result = Parser.findUniqueWords(s);
        for (var entry : result.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        assertTrue(result.get("ПРОГРАММНОГО") == 2);
        assertTrue(result.get("ОБЕСПЕЧЕНИЯ") == 2);
    }
}