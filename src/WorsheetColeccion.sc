object WorsheetColeccion {
  
  val frutas = Array("Manzana", "Pera","Naranja") //> frutas  : Array[String] = Array(Manzana, Pera, Naranja)
  
  //Métodos de listas
  //Posición
  frutas.apply(0)                                 //> res0: String = Manzana
  frutas(2)                                       //> res1: String = Naranja
  
  //Contar elementos
  frutas.length                                   //> res2: Int = 3
  
  //Vacio
  frutas.isEmpty                                  //> res3: Boolean = false
  frutas.nonEmpty                                 //> res4: Boolean = true
  
  //Búsqueda
  frutas indexOf "Naranja"                        //> res5: Int = 2
  
}