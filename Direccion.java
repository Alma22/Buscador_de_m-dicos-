public class Direccion{

	
	private Medico[] listaMedicos;
	private int noMedicos;

	public Direccion( ){

		noMedicos = 0;
		listaMedicos = new Medico[noMedicos];
	}

	public agregarMedico(Medico nuevoMedico){
		unElementoMas();
		ponerValorEn(noMedicos -1, nuevoMedico);

}

	private void unElementoMas(){

		noMedicos++;
		listaMedicos = new Medico[noMedicos];
		for( int i = 0; i < listaMedicos.length; i++){
			tmp[i] = listaMedicos[i];
		}
		listaMedicos = tmp;
}

	private void unElementoMenos(){
		int tC = 0;
		noContactos--;
		Medico[] tmp = new Medico[noContactos];
		for ( int i = 0; i < listaContactos.length; i ++){
			tmp[tC ++] = listaContactos[i];
	}

		listaContactos = tmp;
	}
	


	public void ponerValorEn( Medico nuevoContacto){
		if (int idx >= 0 && i < noContactos){
			listaContactos[idx] = nuevoContacto;
		} else {
			System.out.println("El indice esta fuera de rango");
	}


	}

	public Medico ponerValorEn ( int idx) {
		if (int idx >= 0 && i < noContactos){
			return listaContactos[idx];
		} else {
			System.out.println("El indice esta fuera de rango");
			return null;
	}


	}

	public int longitud (){
		return noContactos;
	}

	/*public boolean eliminar(long itelefono){
		for(int i = 0; i < noContactos; i ++){
			if(listaContactos[i].getTelefono() == itelefono){
				listaContactos[i] = null;
				unElementoMenos();

			}
		}
*/

	}

    
}


	

}