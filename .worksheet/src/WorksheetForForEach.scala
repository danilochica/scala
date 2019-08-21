

object WorksheetForForEach {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  val lenguajes = Seq("Espaniol","Ingles","Frances","Aleman", "Mandarin");System.out.println("""lenguajes  : Seq[String] = """ + $show(lenguajes ));$skip(57); 
  val personas = Seq("Ana", "Sofia", "Jorge" , "Andres");System.out.println("""personas  : Seq[String] = """ + $show(personas ));$skip(87); 
  
  lenguajes.foreach(l => println(s"$l es un idioma ofrecido en la academia SPEAK"));$skip(76); 
  
  for(p <- personas ){
  	println(s"$p es un estudiante de la academia")
  };$skip(96); 
  
    for(p <- personas; l <- lenguajes ){
  	println(s"$p es un estudiante y estudia $l")}

  }
}
