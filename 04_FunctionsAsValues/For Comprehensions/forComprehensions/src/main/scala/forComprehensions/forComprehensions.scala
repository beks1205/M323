package forComprehensions
object forComprehensions extends App {
  val numbers = 1 to 10;

  val doubled =
    for (n <- numbers)  yield n * 2;

  println(doubled);

  val numbersWhole = 1 to 20;

  val evenNumbers =
    for {n <- numbersWhole
      if n %  2 == 0}
      yield n;
  println(evenNumbers)


  val colors = List("Red", "Green", "Blue")
  val fruits = List("Apple", "Banana", "Orange")

  val colorfruits =
    for {
      color <- colors
      fruit <- fruits
    }
      yield (color,fruit)

  colorfruits.foreach(println)


  case class User(name : String, tasks: List[String])

  val users = List(
    User("Alice", List("Task 1", "Task 2", "Task 3")),
    User("Bob", List("Task 1", "Task 4", "Task 5")),
    User("Charlie", List("Task 2", "Task 3", "Task 6"))
  )
  val tasksCompleted = List("Task 1", "Task 3", "Task 5")

  val usersAndNotCompletedTasks =
    for {
      user <- users     
      task <- user.tasks
      if !(tasksCompleted.contains(task))}
      yield (user.name,task)

  usersAndNotCompletedTasks.foreach(println);
}

