class Table_Of_Each_Element {
  //method to write the table
  def Print_Table(listOfElements : List[Int]) = {

    for (element <- listOfElements) {
      println("Table of " + element)

      //using loops to print table up to 10
      for (number <- 1 to 10) {
        println((number * element) + " ")
      }
      println(" ")
    }
  }
}

object table{
  def main (args: Array[String]): Unit = {
    val Table = new Table_Of_Each_Element
    Table.Print_Table(List(4, 7))
  }
}

