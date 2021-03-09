object Last_Element_Of_List {
  def main(args: Array[String]) {
    val list1 = List(6, 1, 7, 5, 10, 16, 29)

    println("The list is " + list1)
    println("The last element of list is " + list1(list1.length - 1) + " at Index " +(list1.length - 1))
  }
}
