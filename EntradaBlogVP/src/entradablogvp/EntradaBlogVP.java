
package entradablogvp;
/*
 * @version 1.00.0
 * @author Vadim Postnov
 */

public class EntradaBlogVP {
	//separador es el ccarácter que separa ENTRADA DE del
	//nombre del autor
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	//Constructor de la clase. recibe el número de entrada, el nombre del autor
	//de la entrada y el texto que contiene la entrada. Si el número de entrada
	//es negativo, lanza una excepción.
	public EntradaBlogVP(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
                
	}
	@Override
        /**
         * compone el mensaje de strings con la variable autor
         */
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	 /**
         * devuelve el numero de la entrada
         */
	public int getId(){
		return this.id;
	}
	
	 /**
         * devuelve el texto completo de la entrada
         */
	public String getTexto(){
		return this.texto;
	}
	
        
        
        /**
         * devuelve el nombre del autor de la entrada en mayúsculas
         * @return nombre en mauysculas
         */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
         /**
         * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         * @return autor
         */
	public String devuelveAutor(){
		return this.autor;
	}
	
         /**
         * funcion main crea una entrada y la reproduce por pantalla
         * @param args         
         */	
	public static void main(String[] args) {
             
		EntradaBlogVP e1=new EntradaBlogVP(3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
