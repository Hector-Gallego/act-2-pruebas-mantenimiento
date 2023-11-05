import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class DolarConverterServiceTest {

    @Test
    void result_one_when_value_is_equals_dolar() {


        DolarService dolarService = Mockito.mock(DolarService.class);
        Mockito.when(dolarService.getDolarValue(DivisasEnum.COL)).
                thenReturn(new DolarCambio(19.3,new Date()));


        DolarConverterService dolarConverterService = new DolarConverterService();
        double dolarValue = dolarConverterService.
                covertToDolar(dolarService.getDolarValue(DivisasEnum.COL),19.3).doubleValue();

        assertEquals(1.0, dolarValue);
    }


    @Test
    void result_is_the_value_of_dolar_divided_value() {
        DolarService dolarService = Mockito.mock(DolarService.class);
        Mockito.when(dolarService.getDolarValue(DivisasEnum.COL)).
                thenReturn(new DolarCambio(20.00,new Date()));
        DolarConverterService dolarConverterService = new DolarConverterService();

        assertEquals(2.0, dolarConverterService.covertToDolar(dolarService
                .getDolarValue(DivisasEnum.COL),40.0).doubleValue());
    }
}