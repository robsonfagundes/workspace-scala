object var_val {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 

  println("Declaring var ou val variables");$skip(97); 

  /**
   * In Java we have:
   * String Text = "My text";
   */
  val text: String = "my text";System.out.println("""text  : String = """ + $show(text ));$skip(86); 

  /**
   * the type is optinal, but look term 'SSN'
   */
  val text2 = "my text 2";System.out.println("""text2  : String = """ + $show(text2 ));$skip(93); val res$0 = 

  /**
   * primitive types, the compiler created
   * an immutable INT (Integer)
   */
  3;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(66); val res$1 = 

  /**
   * Now, enter following line in Worksheet
   */
  3 + 2;System.out.println("""res1: Int(5) = """ + $show(res$1));$skip(12); val res$2 = 
  (3). +(2);System.out.println("""res2: Int(5) = """ + $show(res$2));$skip(16); 
  val three = 3;System.out.println("""three  : Int = """ + $show(three ));$skip(16); 
  val six = 6.0;System.out.println("""six  : Double = """ + $show(six ));$skip(14); val res$3 = 
  three + six;System.out.println("""res3: Double = """ + $show(res$3));$skip(19); val res$4 = 
  3 + 2.5 / 3.9000;System.out.println("""res4: Double = """ + $show(res$4))}
}
