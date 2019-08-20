object WorsheetMatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
 //Simula el swicht de java
	val mes = 13;System.out.println("""mes  : Int = """ + $show(mes ));$skip(340); 
	
	
	println( mes match {
		case 1 => "Enero"
		case 2 => "Febrero"
		case 3 => "Marzo"
		case 4 => "Abril"
		case 5 => "Mayo"
		case 6 => "Junio"
		case 7 => "Julio"
		case 8 => "Agosto"
		case 9 => "Septiembre"
		case 10 => "Octubre"
		case 11 => "Noviembre"
		case 12 => "Diciembre"
		case _ => "Mes invalido"  // DEFAULT
		
	}
	
	)}
	

}
