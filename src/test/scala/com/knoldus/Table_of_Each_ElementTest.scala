package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Table_of_Each_ElementTest extends AnyFlatSpec {
  val table_of_each_element= new Table_of_Each_Element

  "Table" should "return the correct output" in{
    val result = table_of_each_element.allTables(List(12, 2, 5, 8))
    val expected = List(List(12, 24, 36, 48, 60, 72, 84, 96, 108, 120),
      List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20),
      List(5, 10, 15, 20, 25, 30, 35, 40, 45, 50),
      List(8, 16, 24, 32, 40, 48, 56, 64, 72, 80))
    assertResult(expected)(result)
  }

  it should "return -1 as no input is given" in{
    val result = table_of_each_element.allTables(List())
    val expected = List()
    assertResult(expected)(result)
  }


}
