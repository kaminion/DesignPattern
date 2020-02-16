package Chapter02.Description.inter;

public interface Subject {

    // 옵저버 등록과 제거
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // 모든 옵저버들에게 알리기 위함
    public void notifyObservers();

}
