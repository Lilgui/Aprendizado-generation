package JavaDay8;

public class Ex2TesteAnimal {
	public static void main(String args[])
	{
		Ex1Cachorro dog = new Ex1Cachorro();
		dog.setNome("Neil");
		dog.setIdade(3.5);
		dog.setSom("late");
		dog.setMovimentacao("Corre");
		
		Ex1Cavalo horse = new Ex1Cavalo();
		horse.setNome("Pé de pano");
		horse.setIdade(5);
		horse.setSom("relincha");
		horse.setMovimentacao("calvaga");
		
		Ex1Preguiça sloth = new Ex1Preguiça();
		sloth.setNome("Gui Máximo");
		sloth.setIdade(8);
		sloth.setSom("chia");
		sloth.setMovimentacao("sobre nas árvores");
		
		Ex1Animal[] animals = new Ex1Animal[3];
		animals[0] = dog;
		animals[1] = horse;
		animals[2] = sloth;
		
		for(Ex1Animal animal: animals) 
		{
			System.out.println(animal.getNome());
		}
	}
}
