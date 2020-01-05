package ltd.newbee.mall.common;

/**
*Order status:
 * 0. pending payment
 * 1. paid
 * 2. fulfillment
 * 3: delivery successfully
 * 4. transaction successful
 * -1. Manual shutdown
 * -2. Timeout shutdown
 * -3. Merchant shutdown
 */
public enum NewBeeMallOrderStatusEnum {

    DEFAULT(-9, "ERROR"),
    ORDER_PRE_PAY(0, "pending payment"),
    OREDER_PAID(1, "paid"),
    OREDER_PACKAGED(2, "fulfillment"),
    OREDER_EXPRESS(3, "delivery successfully"),
    ORDER_SUCCESS(4, "transaction successful"),
    ORDER_CLOSED_BY_MALLUSER(-1, "Manual shutdown"),
    ORDER_CLOSED_BY_EXPIRED(-2, "Timeout shutdown"),
    ORDER_CLOSED_BY_JUDGE(-3, "Merchant shutdown");

    private int orderStatus;

    private String name;

    NewBeeMallOrderStatusEnum(int orderStatus, String name) {
        this.orderStatus = orderStatus;
        this.name = name;
    }

    public static NewBeeMallOrderStatusEnum getNewBeeMallOrderStatusEnumByStatus(int orderStatus) {
        for (NewBeeMallOrderStatusEnum newBeeMallOrderStatusEnum : NewBeeMallOrderStatusEnum.values()) {
            if (newBeeMallOrderStatusEnum.getOrderStatus() == orderStatus) {
                return newBeeMallOrderStatusEnum;
            }
        }
        return DEFAULT;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
