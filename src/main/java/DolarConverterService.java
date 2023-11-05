public class DolarConverterService {

    public Double covertToDolar(DolarCambio dolar,Double value) {

        return value/dolar.getDolarValue();
    }
}
