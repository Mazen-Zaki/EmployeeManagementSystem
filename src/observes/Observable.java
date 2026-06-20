package observes;

public interface Observable
{
    public void addObserver(Observer observe);
    public void removeObserve(Observer observe);
    public void notifyObservers(String event);
}
