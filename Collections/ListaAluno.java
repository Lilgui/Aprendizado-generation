package Collections;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String args[])
	{
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("John Silva","Java", 6.8);
		Aluno b = new Aluno("Pimpi Sousa","ADS", 7.8);
		Aluno c = new Aluno("indi Thomas","HTTP", 5.6);
		Aluno d = new Aluno("Penny Jones","Pyton", 8.7);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
