import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturaDiariaTest {
    TemperaturaDiariaTest(){

    }
    @Test
    public void deveRetornarGrausCelsius(){
        TemperaturaDiaria.getInstance().setGrausCelsius(20.10f);
        Assertions.assertEquals(20.10f,TemperaturaDiaria.getInstance().getGrausCelsius());
    }
}