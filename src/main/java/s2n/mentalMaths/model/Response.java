package s2n.mentalMaths.model;

public class Response {

    private String msg;
    private String errCode;
    private User user;
    private Object obj;

    public Response() {
    }

    public Response(String msg, String errCode, User user) {
        this.msg = msg;
        this.errCode = errCode;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Response{" +
                "msg='" + msg + '\'' +
                ", errCode='" + errCode + '\'' +
                ", user=" + user +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
