package MapAufgaben

object Main extends App {

  val mapexample : Map[String,String] = Map(("key")->("value"));

  print(" " +  mapexample("key"));

  val m2: Map[String, String] = mapexample.updated("key2" , "value2")

  print(" " + m2("key2"))

  val m3: Map[String,String] = m2.removed("key2").updated("key2", "aDifferentValue")

  print(" " + m3("key2"))

  val m4: Map[String, String] = m3.removed("key")

  print(" " + m4)

  print(" " + m3.get("key"))

  print(" " + m4.get("key"))
}
