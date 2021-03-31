package com.knoldus

  import org.scalatest.flatspec.AnyFlatSpec

  class Stack_ListTest extends  AnyFlatSpec {
    val stack_list = new Stack_List

    "DisplayStack" should "display correct output" in {
      val result = stack_list.displayStack(List(7,8,9))
      assertResult(List(9,8,7))(result)
    }

    "StackPush" should "return correct output" in {
      val result = stack_list.stackPush(List(7,8,9),6)
      assertResult(List(6,9,8,7))(result)
    }

    "StackPop" should "display correct output" in {
      val result = stack_list.stackPop(List(6,7,8,9))
      assertResult((9,List(8,7,6)))(result)
    }

    "StackPop" should "display nothing" in {
      val result = stack_list.stackPop(List())
      assertResult((-1,List()))(result)
    }
  }
