package _08_cleancode_refactoring._1practice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0, 0) ")
    void testGetVolume0and0(){
        double expected =0;

        double result = Cylinder.getVolume(0,0);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1and2(){
        int radius = 1;
        int heigth = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius,heigth);
        assertEquals(expected,result);
    }

}
