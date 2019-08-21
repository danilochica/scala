object WorksheetOperacionesConMapas {
   
  //operaciones con mapas
   
   val mapa1 = Map(1 -> "Danilo", 2 -> "Juan", 3 -> "Elena", 4 -> "Pepito", 5 -> "Luis")
                                                  //> mapa1  : scala.collection.immutable.Map[Int,String] = Map(5 -> Luis, 1 -> Da
                                                  //| nilo, 2 -> Juan, 3 -> Elena, 4 -> Pepito)
  
  mapa1 + (6 ->"Carolina" , 7->"Maria Clara")     //> res0: scala.collection.immutable.Map[Int,String] = Map(5 -> Luis, 1 -> Danil
                                                  //| o, 6 -> Carolina, 2 -> Juan, 7 -> Maria Clara, 3 -> Elena, 4 -> Pepito)
                                                  
  mapa1 - 7                                       //> res1: scala.collection.immutable.Map[Int,String] = Map(5 -> Luis, 1 -> Danil
                                                  //| o, 2 -> Juan, 3 -> Elena, 4 -> Pepito)
                                                  
  val mapa2 = Map(8 -> "Carros", 9 -> "Motos")    //> mapa2  : scala.collection.immutable.Map[Int,String] = Map(8 -> Carros, 9 -> 
                                                  //| Motos)
  
  mapa1 ++ mapa2                                  //> res2: scala.collection.immutable.Map[Int,String] = Map(5 -> Luis, 1 -> Danil
                                                  //| o, 9 -> Motos, 2 -> Juan, 3 -> Elena, 8 -> Carros, 4 -> Pepito)
  
  
                                  
}