object WorksheetFlattenFlatMap {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
	
	 val lista = List( List(1, 2 ,3), List(4, 5 ,6), List(7 ,8 ,9));System.out.println("""lista  : List[List[Int]] = """ + $show(lista ));$skip(18); val res$0 = 

   lista.flatten;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(52); val res$1 = 
   lista.map {(x:List [Int]) => x.map { n => n*2} };System.out.println("""res1: List[List[Int]] = """ + $show(res$1));$skip(61); val res$2 = 
    lista.map {(x:List [Int]) => x.map { n => n*2} }.flatten;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(44); 
    
    val num = List( 1, 2, 4, 5, 7, 11);System.out.println("""num  : List[Int] = """ + $show(num ));$skip(40); val res$3 = 
    num.flatMap {x => List(x , x + 5) };System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(85); 
    
    
    val carros = List("BMW","Mazda","Mercedez","Toyota","Dodge","Renault");System.out.println("""carros  : List[String] = """ + $show(carros ));$skip(44); val res$4 = 
    
    carros.flatMap{c=>c.toUpperCase()};System.out.println("""res4: List[Char] = """ + $show(res$4));$skip(48); val res$5 = 
    carros.flatMap{c=>c.toUpperCase()}.distinct;System.out.println("""res5: List[Char] = """ + $show(res$5))}
                                                  
                                               
   
}
