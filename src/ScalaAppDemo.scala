object ScalaAppDemo extends App {
  println("ScalaAppDemo ==> ");
  var aScalaClass = new AScalaClass();
  aScalaClass.doSomething();
  var aJavaClass = new AJavaClass();
  aJavaClass.doSomething();
  println("------------------");
}