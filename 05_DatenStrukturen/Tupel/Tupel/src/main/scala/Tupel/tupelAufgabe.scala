package Tupel

import java.time.LocalTime


object tupelAufgabe extends App{

  def weather(): (String, LocalTime, Double) = {

    val weatherDescription = "sonnig"
    val temperature = 25.0

    val currentTime = LocalTime.now()

    (weatherDescription, currentTime, temperature)
  }

  val (description, time, temperature) = weather();

  println(s"Wetter: $description")
  println(s"Aktuelle Zeit: $time")
  println(s"Aktuelle Temperatur: $temperature")


  val w1 = ("sonnig", "heute", 23.0)
  val w2 = ("regen", "gestern", 15.0)
  val w3 = ("schnee", "vorgestern", 0.02)
  val w4 = ("hagel", "morgen", 2.0)
  val w5 = ("regen", "später", 12.0)

  val wetterList = List(w1,w2,w3,w4,w5)

  val wetterListKriteriaTrue = wetterList.foreach{ tuple => {
    tuple match {
      case e if e._1 == "regen" => println("es gibt regen")
      case d if d._3 > 12 => println("wärmer als 12")
      case _ => None
    }
  }
  }


}
