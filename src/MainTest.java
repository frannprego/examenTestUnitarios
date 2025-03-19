import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {

    @ParameterizedTest
    @CsvSource({
            "00000000, T, true",
            "12345678, Z, true",
            "87654321, X, true",
            "00000000, A, false",
            "99999999, R, true"
    })

    void testComprobarDNI(String dni, char letra, boolean expected) {
        assertEquals(expected, Main.comprobarDNI(dni, letra));
    }

    @ParameterizedTest
    @CsvSource({
            "00000000, A",
            "12345678, B",
            "87654321, C",
            "99999999, D",
            "00000000, E",
            "12345678, F",
            "87654321, G",
            "99999999, H" ,
            "00000000, I",
            "12345678, J",
            "87654321, K",
            "99999999, L",
            "00000000, M",
            "12345678, N",
            "87654321, Ñ",
            "99999999, O",
            "00000000, P",
            "12345678, Q",
            "87654321, R",
            "99999999, S",
            "00000000, T",
            "12345678, U",
            "87654321, V",
            "99999999, W",
            "00000000, X",
            "12345678, Y",
            "87654321, Z",

    })
    void testCalcularLetraDNI(String dni, char expected) {
        assertEquals(expected, Main.calcularLetraDNI(dni));
    }
}

