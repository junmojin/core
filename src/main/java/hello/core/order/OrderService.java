package hello.core.order;

public interface OrderService {
    //OrderService : 주문 서비스
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
