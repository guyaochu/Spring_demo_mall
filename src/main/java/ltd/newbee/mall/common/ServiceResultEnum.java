package ltd.newbee.mall.common;


public enum ServiceResultEnum {
    ERROR("error"),

    SUCCESS("success"),

    DATA_NOT_EXIST("No records found!"),

    SAME_CATEGORY_EXIST("There are categories of the same name and same name!"),

    SAME_LOGIN_NAME_EXIST("Username already exists!"),

    LOGIN_NAME_NULL("Please enter your login name!"),

    LOGIN_PASSWORD_NULL("Please enter the password!"),

    LOGIN_VERIFY_CODE_NULL("please enter verification code!"),

    LOGIN_VERIFY_CODE_ERROR("Verification code error!"),

    GOODS_NOT_EXIST("Item does not exist!"),

    SHOPPING_CART_ITEM_LIMIT_NUMBER_ERROR("Exceed the maximum purchase quantity of a single product!"),

    LOGIN_ERROR("Login failed!"),

    LOGIN_USER_LOCKED("User has been banned from logging in!"),

    ORDER_NOT_EXIST_ERROR("Order does not exist!"),

    NULL_ADDRESS_ERROR("Address cannot be empty!"),

    ORDER_PRICE_ERROR("Order price is abnormal!"),

    ORDER_GENERATE_ERROR("Generated order exception!"),

    SHOPPING_ITEM_ERROR("Shopping cart data is abnormal!"),

    SHOPPING_ITEM_COUNT_ERROR("Out of stock!"),

    ORDER_STATUS_ERROR("Order status is abnormal!"),

    OPERATE_ERROR("operation failed!"),

    DB_ERROR("database error");

    private String result;

    ServiceResultEnum(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
