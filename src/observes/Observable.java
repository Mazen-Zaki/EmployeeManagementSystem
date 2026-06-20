package observes;

public interface Observable
{
    public void addObserver(Observer observe);
    public void removeObserver(Observer observe);
    public void notifyObservers(String event);
}
