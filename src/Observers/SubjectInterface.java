package Observers;

public interface SubjectInterface {

    void register(Observer observer);
    void unregister(Observer observer);
}
