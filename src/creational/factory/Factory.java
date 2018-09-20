package creational.factory;

public class Factory {
  public static void main(String[] args) {
    System.out.println(ReaderFactory.getReader(TypeReader.DATABASE).read()); // TODO: 19/09/18 se puede usar enum?
  }
}

enum TypeReader {
  XML, DATABASE, CSV;
}

interface Reader {
  String read();
}

class DataBaseReader implements Reader {
  @Override
  public String read() {
    return "Reading database";
  }
}

class XMLReader implements Reader {
  @Override
  public String read() {
    return "XML file reader";
  }
}

class CSVReader implements Reader {
  @Override
  public String read() {
    return "CSV file reading";
  }
}

class ReaderFactory {
  public static Reader getReader(TypeReader readerType) {
    Reader reader = null;
    if (readerType.equals(TypeReader.XML)) {
      reader = new XMLReader();
    } else if (readerType.equals(TypeReader.CSV)) {
      reader = new CSVReader();
    } else if (readerType.equals(TypeReader.DATABASE)) {
      reader = new DataBaseReader();
    }
    return reader;
  }
}