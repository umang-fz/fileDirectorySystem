package commands

import fileSystem.State
trait Command {
  def apply(state: State): State
}

object Command {
  def from(input :String) : Command = new UnknownCommand()
}

class UnknownCommand extends Command {
  override def apply(state: State): State = state.setMessage("Command not found")
}
