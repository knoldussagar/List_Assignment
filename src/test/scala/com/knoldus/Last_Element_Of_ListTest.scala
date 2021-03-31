package com.knoldus


import org.scalatest.flatspec.AnyFlatSpec

class Last_Element_Of_ListTest extends AnyFlatSpec {
  val last_element_of_list = new Last_Element_Of_List

  "LastElement" should "return 7,5" in {
    val result = last_element_of_list.lastElement(List(1,4,3,2,2,7))
    assertResult((7,5))(result)
  }

  it should "return -1,-1" in {
    val result = last_element_of_list.lastElement(List())
    assertResult((-1,-1))(result)
  }
  it should "return -3,0" in {
    val result = last_element_of_list.lastElement(List(-3))
  }
}
