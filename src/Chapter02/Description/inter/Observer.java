package Chapter02.Description.inter;

public interface Observer {
    // 기상 정보 업데이트 시 옵저버에게 전달되는 상태
    public void update(float temp, float humidity, float pressure);
}
