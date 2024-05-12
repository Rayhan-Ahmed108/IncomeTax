import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class IncomeTaxTest {
    IncomeTax person1, person2, person3, person4, person5, person6, person7, person8, person9, person10;
    @BeforeEach
    void setUp() {
        person1 = new IncomeTax(3000,1);
    }

    @Test
    void getPerson1Tax() {
        assertEquals(300, person1.getTax());
    }
    @Test
    void getPerson2Tax() {
        assertEquals(100, person2.getTax());
    }
}