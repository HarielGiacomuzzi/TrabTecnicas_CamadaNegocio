package Negocio;

public class CalculoIrpfNaturalizadoAdapter implements CalculoIrpf {
    private CalculoIrpfNaturalizado calculoNaturalizado;

    @Override
    public double calculaImposto(Contribuinte c) {
        calculoNaturalizado = new CalculoIrpfNaturalizado(c);
       
        return calculoNaturalizado.imposto_A_Pagar(calculoNaturalizado.baseDeCalculo(), calculoNaturalizado.fatorEspecifico());
    }

}
