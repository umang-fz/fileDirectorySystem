package files

class Directory(override val parentPath: String, override val name: String, val contents: List[DirEntry])
  extends DirEntry (parentPath, name) {

}

object Directory {
  val SEPERATOR: String = "/"
  val ROOT_PATH: String = "/"

  def ROOT = Directory.empty("","")
  def empty(parentPath: String, name: String) : Directory = new Directory(parentPath, name, List())
}
