

object WorksheetForForEach {
  val lenguajes = Seq("Espaniol","Ingles","Frances","Aleman", "Mandarin")
                                                  //> lenguajes  : Seq[String] = List(Espaniol, Ingles, Frances, Aleman, Mandarin)
                                                  //| 
  val personas = Seq("Ana", "Sofia", "Jorge" , "Andres")
                                                  //> personas  : Seq[String] = List(Ana, Sofia, Jorge, Andres)
  
  lenguajes.foreach(l => println(s"$l es un idioma ofrecido en la academia SPEAK"))
                                                  //> Espaniol es un idioma ofrecido en la academia SPEAK
                                                  //| Ingles es un idioma ofrecido en la academia SPEAK
                                                  //| Frances es un idioma ofrecido en la academia SPEAK
                                                  //| Aleman es un idioma ofrecido en la academia SPEAK
                                                  //| Mandarin es un idioma ofrecido en la academia SPEAK
  
  for(p <- personas ){
  	println(s"$p es un estudiante de la academia")
                                                  //> Ana es un estudiante de la academia
                                                  //| Sofia es un estudiante de la academia
                                                  //| Jorge es un estudiante de la academia
                                                  //| Andres es un estudiante de la academia
  }
  
    for(p <- personas; l <- lenguajes ){
  	println(s"$p es un estudiante y estudia $l")
                                                  //> Ana es un estudiante y estudia Espaniol
                                                  //| Ana es un estudiante y estudia Ingles
                                                  //| Ana es un estudiante y estudia Frances
                                                  //| Ana es un estudiante y estudia Aleman
                                                  //| Ana es un estudiante y estudia Mandarin
                                                  //| Sofia es un estudiante y estudia Espaniol
                                                  //| Sofia es un estudiante y estudia Ingles
                                                  //| Sofia es un estudiante y estudia Frances
                                                  //| Sofia es un estudiante y estudia Aleman
                                                  //| Sofia es un estudiante y estudia Mandarin
                                                  //| Jorge es un estudiante y estudia Espaniol
                                                  //| Jorge es un estudiante y estudia Ingles
                                                  //| Jorge es un estudiante y estudia Frances
                                                  //| Jorge es un estudiante y estudia Aleman
                                                  //| Jorge es un estudiante y estudia Mandarin
                                                  //| Andres es un estudiante y estudia Espaniol
                                                  //| Andres es un estudiante y estudia Ingles
                                                  //| Andres es un estudiante y estudia Frances
                                                  //| Andres es un estudiante y estudia Aleman
                                                  //| Andres es un estudiante y estudia Mandarin

  }
}