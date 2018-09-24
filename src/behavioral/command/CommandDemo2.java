package behavioral.command;

public class CommandDemo2 { // TODO: 23/09/18 Explicar

  public static void main(String args[]) {
    FileSystem fs = FileSystemUtil.getUnderlyingFileSystem();
    ReadCommand readCommand = new ReadCommand(fs);
    FileInvoker file = new FileInvoker(readCommand);
    file.execute();

    WriteCommand writeCommand = new WriteCommand(fs);
    file = new FileInvoker(writeCommand);
    file.execute();
  }
}

interface FileSystem {

  void readFile();

  void writeFile();
}

class WindowsFileUtility implements FileSystem {

  @Override
  public void readFile() {
    System.out.println("Read file in Windos OS.");
  }

  @Override
  public void writeFile() {
    System.out.println("Write file in Windos OS.");
  }
}

class LinuxFileUtility implements FileSystem {

  @Override
  public void readFile() {
    System.out.println("Read file in Linux OS.");
  }

  @Override
  public void writeFile() {
    System.out.println("Write file in Linux OS.");
  }
}

class MacOSFileUtility implements FileSystem {

  @Override
  public void readFile() {
    System.out.println("Read file in MacOS.");
  }

  @Override
  public void writeFile() {
    System.out.println("Write file in MacOS.");
  }
}

interface Command {

  void execute();
}

class ReadCommand implements Command {

  private FileSystem fileSystem;

  ReadCommand(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public void execute() {
    this.fileSystem.readFile();
  }
}

class WriteCommand implements Command {

  private FileSystem fileSystem;

  WriteCommand(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public void execute() {
    this.fileSystem.writeFile();
  }
}

class FileInvoker {

  private Command command;

  FileInvoker(Command c) {
    this.command = c;
  }

  void execute() {
    this.command.execute();
  }
}

class FileSystemUtil {

  static FileSystem getUnderlyingFileSystem() {
    String operatingSystem = System.getProperty("os.name");
    System.out.println("Underlying OS is:" + operatingSystem);
    if (operatingSystem.contains("Windows")) {
      return new WindowsFileUtility();
    } else if (operatingSystem.contains("Mac")) {
      return new MacOSFileUtility();
    }else {
      return new LinuxFileUtility();
    }
  }
}