object WorksheetFlattenFlatMap {
	
	 val lista = List( List(1, 2 ,3), List(4, 5 ,6), List(7 ,8 ,9))
                                                  //> lista  : List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
                                                  //| 

   lista.flatten                                  //> res0: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
   lista.map {(x:List [Int]) => x.map { n => n*2} }
                                                  //> res1: List[List[Int]] = List(List(2, 4, 6), List(8, 10, 12), List(14, 16, 18
                                                  //| ))
    lista.map {(x:List [Int]) => x.map { n => n*2} }.flatten
                                                  //> res2: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
    
    val num = List( 1, 2, 4, 5, 7, 11)            //> num  : List[Int] = List(1, 2, 4, 5, 7, 11)
    num.flatMap {x => List(x , x + 5) }           //> res3: List[Int] = List(1, 6, 2, 7, 4, 9, 5, 10, 7, 12, 11, 16)
    
    
    val carros = List("BMW","Mazda","Mercedez","Toyota","Dodge","Renault")
                                                  //> carros  : List[String] = List(BMW, Mazda, Mercedez, Toyota, Dodge, Renault)
                                                  //| 
    
    carros.flatMap{c=>c.toUpperCase()}            //> res4: List[Char] = List(B, M, W, M, A, Z, D, A, M, E, R, C, E, D, E, Z, T, O
                                                  //| , Y, O, T, A, D, O, D, G, E, R, E, N, A, U, L, T)
    carros.flatMap{c=>c.toUpperCase()}.distinct   //> res5: List[Char] = List(B, M, W, A, Z, D, E, R, C, T, O, Y, G, N, U, L)
                                                  
                                               
   
}