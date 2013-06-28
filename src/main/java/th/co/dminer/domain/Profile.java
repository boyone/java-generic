package th.co.dminer.domain;

/**
 * Created with IntelliJ IDEA.
 * User: boyone
 * Date: 6/28/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Profile {
    private String tmnId;

    public Profile(String tmnId) {
        this.tmnId = tmnId;
    }

    public void setTmnId(String tmnId) {
        this.tmnId = tmnId;
    }

    public String getTmnId() {
        return tmnId;
    }
}
