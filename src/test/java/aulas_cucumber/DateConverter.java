package aulas_cucumber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

//Crio uma classe que ir� extender do Transform do Cucumber
public class DateConverter extends Transformer<Date> {

	//Inicializo como super classe, crio o m�todo para implemnetar e crio uma excecao
	@Override
	public Date transform(String arg0) {
		//Instanciando o m�todo 
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
		java.text.DateFormat format = null;
		try {
			Date retorno = format.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	
}
