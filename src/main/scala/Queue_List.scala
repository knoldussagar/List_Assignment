// Scala program for illustrating Queue

// Import Queue
import scala.collection.mutable._

// Creating object
object Queue_List
{
  // Main method
  def main(args:Array[String])
  {
    // Initialize a queue
    var q1 = Queue(1, 2, 3, 4, 5)

    // Print the elements of queue
    print("Queue Elements: ")
    q1.foreach((element:Int) => print(element+" "))

    // Print the first element of the queue
    var firstElement = q1.front
    println("\nFirst element in the queue: "+ firstElement)

    // Enqueue 10 in the queue
    q1.enqueue(10)

    // Print the elements of queue
    print("Queue Elements after enqueue: ")
    q1.foreach((element:Int) => print(element+" "))

    // Dequeue first element from the queue
    var deq = q1.dequeue

    // Print the elements of queue
    print("\nQueue Elements after dequeue: ")
    q1.foreach((element:Int) => print(element+" "))

    // Print the Dequeued element
    print("\nDequeued element: " + deq)

    // using isEmpty method
    println("\nQueue is empty: "+ q1.isEmpty)
  }
}

