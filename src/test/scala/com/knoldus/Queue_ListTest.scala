package com.knoldus

  import org.scalatest.flatspec.AnyFlatSpec

  class Queue_ListTest  extends AnyFlatSpec {
    val queue_list = new Queue_List

    "DisplayQueue" should "display correct output" in {
      val result = queue_list.topQueue(List(7,8,9))
      assertResult(List(7,8,9))(result)
    }

    "Front Queue" should "return correct output" in {
      val result = queue_list.frontQueue(List(1,2,3))
      assertResult(1)(result)
    }

    "Front Queue" should "display nothing" in {
      val result = queue_list.frontQueue(List())
      assertResult(-1)(result)
    }

    "EnQueue" should "display correct output" in {
      val result = queue_list.enQueue(List(7,8,9),6)
      assertResult(List(7,8,9,6))(result)
    }

    "DeQueue" should "display correct output" in {
      val result = queue_list.deQueue(List(7,8,9))
      assertResult(List(8,9))(result)
    }

    "DeQueue" should "display nothing" in {
      val result = queue_list.deQueue(List())
      assertResult(List())(result)
    }
  }


