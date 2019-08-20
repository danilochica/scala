object WorsheetColeccion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  
  val frutas = Array("Manzana", "Pera","Naranja");System.out.println("""frutas  : Array[String] = """ + $show(frutas ));$skip(56); val res$0 = 
  
  //Métodos de listas
  //Posición
  frutas.apply(0);System.out.println("""res0: String = """ + $show(res$0));$skip(12); val res$1 = 
  frutas(2);System.out.println("""res1: String = """ + $show(res$1));$skip(40); val res$2 = 
  
  //Contar elementos
  frutas.length;System.out.println("""res2: Int = """ + $show(res$2));$skip(30); val res$3 = 
  
  //Vacio
  frutas.isEmpty;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(18); val res$4 = 
  frutas.nonEmpty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(43); val res$5 = 
  
  //Búsqueda
  frutas indexOf "Naranja";System.out.println("""res5: Int = """ + $show(res$5))}
  
}
