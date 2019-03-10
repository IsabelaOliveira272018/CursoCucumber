package br.com.curso_cucumber.converts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

//Crio uma classe que irá extender do Transform do Cucumber
public class DateConverter extends Transformer<Date> {

	//Inicializo como super classe, crio o método para implemnetar e crio uma excecao
	@Override
	public Date transform(String arg0) {
		//Instanciando o método 
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date retorno = format.parse(arg0);
			return retorno;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
}