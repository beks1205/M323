package Zusatzaufgabe

object trendfunc extends App {


  val Listof = List(BigDecimal(2) , BigDecimal(4), BigDecimal(3), BigDecimal(8),BigDecimal(4))
  def trending(rates : List[BigDecimal]) : (Boolean) = {

    val ratePairs = rates.zip(rates.drop(1))

    val trendfollows = ratePairs.forall{
      case (previousrate, currentrate ) => currentrate > previousrate
    }
    trendfollows
  }

  val isTrending = trending(Listof);

  println(isTrending)

}
