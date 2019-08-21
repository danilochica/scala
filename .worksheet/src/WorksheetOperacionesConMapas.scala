object WorksheetOperacionesConMapas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(160); 
   
  //operaciones con mapas
   
   val mapa1 = Map(1 -> "Danilo", 2 -> "Juan", 3 -> "Elena", 4 -> "Pepito", 5 -> "Luis");System.out.println("""mapa1  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa1 ));$skip(49); val res$0 = 
  
  mapa1 + (6 ->"Carolina" , 7->"Maria Clara");System.out.println("""res0: scala.collection.immutable.Map[Int,String] = """ + $show(res$0));$skip(63); val res$1 = 
                                                  
  mapa1 - 7;System.out.println("""res1: scala.collection.immutable.Map[Int,String] = """ + $show(res$1));$skip(98); 
                                                  
  val mapa2 = Map(8 -> "Carros", 9 -> "Motos");System.out.println("""mapa2  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa2 ));$skip(20); val res$2 = 
  
  mapa1 ++ mapa2;System.out.println("""res2: scala.collection.immutable.Map[Int,String] = """ + $show(res$2))}
  
  
                                  
}
