public class MultipleClassesInSameFile {
  public static void main(String[] args) {
    System.out.println(GenerateMessage.generateMessage());
    System.out.println(AnotherMessage.generateAnotherMessage());
  }
}

class GenerateMessage {
  static String generateMessage() {
    return "Here is a message!";
  }
}

class AnotherMessage {
  static String generateAnotherMessage() {
    return "Here is another message!";
  }
}