package demo;

/**
 * @ClassName FunctionEnum
 * @Description FunctionEnum
 * @Author yunp
 * @Date 2020/7/21 9:34
 * @Version 1.0
 **/
public enum FunctionEnum {


    IM(1L,"IM消息"),
    SYSTEM(2L,"系统"),
    MAIL(3L,"邮箱"),
    SMS(4L,"短信"),
    ;

    private Long operator;


    private String functionName;


    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    private FunctionEnum(Long operator, String functionName){


        this.operator = operator;
        this.functionName = functionName;

    }


}
