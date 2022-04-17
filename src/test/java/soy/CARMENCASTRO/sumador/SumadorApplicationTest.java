package soy.CARMENCASTRO.sumador;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class SumadorApplicationTest {

    private Sumador sumador = new Sumador();



    @Test

    public void testSum() {

         assertEquals(5, sumador.suma(2, 3));

    }    

}



/*
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SumadorApplicationTests {

	@Test
	void contextLoads() {
	}

}
*/
