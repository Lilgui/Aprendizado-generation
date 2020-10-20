package Collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapAluno {
	public static void main(String args[])
	{
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("John Silva","Java", 6.8);
		Aluno b = new Aluno("Pimpi Sousa","ADS", 7.8);
		Aluno c = new Aluno("indi Thomas","HTTP", 5.6);
		Aluno d = new Aluno("Penny Jones","Pyton", 8.7);
		
		mapa.put("John Silva", a);
		mapa.put("Pimpi Sousa", b);
		mapa.put("indi Thomas", c);
		mapa.put("Penny Jones", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Indi Thomas"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e:alunos)
		{
			System.out.println(e);
		}
	}
}
