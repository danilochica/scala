
object WorsheetMaps {
  val numeros =List(4,8,11,15,16,25)              //> numeros  : List[Int] = List(4, 8, 11, 15, 16, 25)

  numeros.map { x => 2 * x}                       //> res0: List[Int] = List(8, 16, 22, 30, 32, 50)
  numeros.map { x => x * x}                       //> res1: List[Int] = List(16, 64, 121, 225, 256, 625)
  
  
  val carros = List("BMW","Mazda","Mercedez","Toyota","Dodge","Renault")
                                                  //> carros  : List[String] = List(BMW, Mazda, Mercedez, Toyota, Dodge, Renault)
                                                  //| 
  carros.map(x => x.toUpperCase())                //> res2: List[String] = List(BMW, MAZDA, MERCEDEZ, TOYOTA, DODGE, RENAULT)
  carros.map(x => x.length())                     //> res3: List[Int] = List(3, 5, 8, 6, 5, 7)
  carros.map(_.toLowerCase())                     //> res4: List[String] = List(bmw, mazda, mercedez, toyota, dodge, renault)
  carros.map(_.length())                          //> res5: List[Int] = List(3, 5, 8, 6, 5, 7)
}