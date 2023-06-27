package Ejercicio_tema5_Interfaces;

public class CocheCRUDImpl implements CocheCRUD{

	@Override
	public void save() {
		System.out.println("Data saved");
	}

	@Override
	public void findAll() {
		
		System.out.println("Data finded");
	}

	@Override
	public void delete() {
		
		System.out.println("Data deleted");
	}

}
