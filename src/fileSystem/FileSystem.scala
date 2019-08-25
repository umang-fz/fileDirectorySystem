package fileSystem

import java.util.Scanner

import files.Directory
import commands.Command

object FileSystem extends App{
  val scanner = new Scanner(System.in)
  val root = Directory.ROOT
  var state = State(root, root, "")
  while (true) {
    state.show()
    val imput = scanner.nextLine()
    state = Command.from(imput).apply(state)
  }
}
