object WorsheetPrueba {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); 
	println("Hola Mundo");$skip(12); 
	val n = 50;System.out.println("""n  : Int = """ + $show(n ));$skip(91); 
	
	def numero (): String = if( n == 20)"El valor de K es 20" else "Valor no parametrizado";System.out.println("""numero: ()String""");$skip(12); val res$0 = 
	
	numero();System.out.println("""res0: String = """ + $show(res$0))}
}
