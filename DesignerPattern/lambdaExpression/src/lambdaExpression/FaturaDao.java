package lambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaturaDao {

	
	public List<Fatura> buscarFatura(){
		List<Fatura> faturas = new ArrayList<Fatura>();
		faturas.add(new Fatura("anjobrito@gmail.com", 2.44, LocalDate.now().minusDays(4)));
		faturas.add(new Fatura("andrerosa@gmail.com", 9.44, LocalDate.now().minusDays(5)));
		faturas.add(new Fatura("pauloCesar@gmail.com", 12.44, LocalDate.now().minusDays(9)));
		faturas.add(new Fatura("silvioarruda@gmail.com", 16.44, LocalDate.now().minusDays(14)));		
		return faturas;
		
	}
	
	public List<Fatura> buscarFatura2(){		
		Fatura f1 = new Fatura("anjobrito@gmail.com", 2.44, LocalDate.now().minusDays(4));
		Fatura f2 = new Fatura("andrerosa@gmail.com", 9.44, LocalDate.now().minusDays(5));
		Fatura f3 = new Fatura("pauloCesar@gmail.com", 12.44, LocalDate.now().minusDays(9));
		Fatura f4 = new Fatura("silvioarruda@gmail.com", 16.44, LocalDate.now().minusDays(14));		
		return Arrays.asList(f1,f2,f3,f4); 
		
	}
	
	
}
