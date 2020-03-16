package test;

/**
 * @author 蔡瑞峰
 * 2020-3-4 22:45
 */
public class Orders {
    /**
     * 订单状态
     */
    private String state;
    /**
     * 商品名称
     */
    private String goodsname;
    /**
     * 收货人名字
     */
    private String peoplename;
    /**
     * 商品价格
     */
    private int price;
    /**
     * 收货人电话
     */
    private String tele;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 修改人
     */
    private String updateUsers;

    public Orders(String state, int price, String tele, String goodsname) {
        this.state = state;
        this.price = price;
        this.tele = tele;
        this.goodsname = goodsname;
    }

    public String getState() {
        return state;
    }
}
