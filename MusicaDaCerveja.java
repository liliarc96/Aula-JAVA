
public class MusicaDaCerveja {

	public static void main(String[] args) {
		int cervejas = 99;
		
		while(cervejas > 97){
			System.out.println(cervejas + " cervejas na freezer.");
			
			System.out.println("Pego uma garrafa, passo pra frente.");
			
			cervejas = cervejas - 1;
			
			System.out.println("Agora são " + cervejas + " na freezer.\n\n");
		}
	}

}
