package top.uuanqin.simpleEvenbus.pattern;

/**
 * @author uuanqin
 */
public interface Subject {
  void registerObserver(Object observer);
  void removeObserver(Object observer);
  void notifyObservers(Object message);
}