package Week_4.BehavioralPatterns.observer;

interface Subject 
{
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void setTitle(String title);
    void notifySubcribers();

}
