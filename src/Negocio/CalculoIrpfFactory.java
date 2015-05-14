/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Bernardo Copstein
 */

public class CalculoIrpfFactory {
	private CalculoIrpfSimplificado simples;
	private CalculoIrpfCompleto completo;
	
	public CalculoIrpf createInstance(TipoCalculo t) {
        switch(t) {
            case SIMPLIFICADO:
              if (simples == null){
            	  simples =  new CalculoIrpfSimplificado();
              	  return simples;
              }
              return simples;
            case COMPLETO:
                if (completo == null){
                	completo =  new CalculoIrpfCompleto();
                	return completo;
                }
                return completo;
        }
        return null;
    }
}
