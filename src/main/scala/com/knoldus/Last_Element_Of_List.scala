package com.knoldus

class Last_Element_Of_List {
  def lastElement(list: List[Int]): (Int, Int) = {
    var length = 0

    for (element <- list) {
      length += 1
    }
    //list(length-1) returns the last element of list and (length-1) returns the last index
    try {
      (list(length - 1), length - 1)
    }
    catch
      {
        case e: IndexOutOfBoundsException => (-1, -1)
      }
  }
}