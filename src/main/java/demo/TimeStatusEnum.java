package demo;

/**
 * @ClassName TimeStatusEnum
 * @Description 时间状态
 * @Author yunp
 * @Date 2020/7/21 10:00
 * @Version 1.0
 **/
public enum TimeStatusEnum {

    CLOSE(0b00,"关闭"),
    OPEN(0b01,"打开"),
    SPACE(0b10,"其他"),
    USE(0b11,"占用"),
    ;

    private int operator;


    private String statusName;

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    private TimeStatusEnum(int operator,String statusName){

        this.operator = operator;
        this.statusName = statusName;

   }

}
