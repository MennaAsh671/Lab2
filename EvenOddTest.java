import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddcheckTest {

    EvenOddcheck test = new EvenOddcheck();

    @Test
    public void zeroIsEven(){
        assertEquals("This number is even", test.EvenorOdd(0));
    }

    @Test
    public void twoIsEven(){
        assertEquals("This number is even", test.EvenorOdd(2));
    }

    @Test
    public void twentyIsEven(){
        assertEquals("This number is even", test.EvenorOdd(20));
    }

    @Test
    public void thirtyIsEven(){
        assertEquals("This number is even", test.EvenorOdd(30));
    }

    @Test
    public void oneIsOdd(){
        assertEquals("This number is odd", test.EvenorOdd(1));
    }

    @Test
    public void thirtyThreeIsOdd(){
        assertEquals("This number is odd", test.EvenorOdd(33));
    }

    @Test
    public void ninetyNineIsOdd(){
        assertEquals("This number is odd", test.EvenorOdd(99));
    }

    @Test
    public void twentyThreeIsOdd(){
        assertEquals("This number is odd", test.EvenorOdd(23));

    }

}