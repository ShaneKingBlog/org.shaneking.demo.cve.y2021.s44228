//Log4j2 Remote Call Execute
public class Log4j2Rce {
  static {
    System.out.println("SkTest211213Before: will print when Log4j2Rce loaded in static.");
  }

  public Log4j2Rce() {
    System.out.println("SkTest211213Before: will print when Log4j2Rce loaded in constructor.");
  }
}
