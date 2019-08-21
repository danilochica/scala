
object WorsheetMaps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  val numeros =List[Int](4,8,11,15,16,25);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(29); val res$0 = 

  numeros.map { x => 2 * x};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(28); val res$1 = 
  numeros.map { x => x * x};System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(79); 
  
  
  val carros = List("BMW","Mazda","Mercedez","Toyota","Dodge","Renault");System.out.println("""carros  : List[String] = """ + $show(carros ));$skip(35); val res$2 = 
  carros.map(x => x.toUpperCase());System.out.println("""res2: List[String] = """ + $show(res$2));$skip(30); val res$3 = 
  carros.map(x => x.length());System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  carros.map(_.toLowerCase());System.out.println("""res4: List[String] = """ + $show(res$4));$skip(25); val res$5 = 
  carros.map(_.length());System.out.println("""res5: List[Int] = """ + $show(res$5))}
 
}
