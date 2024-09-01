import java.awt.image.BufferedImage;

public class IT18 {
    private int no;
    private int ID;
    private String FirstNameandLastName;
    private String nickname;
    private String Facebook;
    private String IG;
    private String IDLine;
    private String Contact;

    public IT18(int no, int ID, String FirstNameandLastName, String nickname, String Facebook, String IG, String IDLine, String Contact) {
        this.no = no;
        this.ID = ID;
        this.FirstNameandLastName = FirstNameandLastName;
        this.nickname = nickname;
        this.Facebook = Facebook;
        this.IG = IG;
        this.IDLine = IDLine;
        this.Contact = Contact;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstNameandLastName() {
        return FirstNameandLastName;
    }

    public void setFirstNameandLastName(String FirstNameandLastName) {
        this.FirstNameandLastName = FirstNameandLastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getIG() {
        return IG;
    }

    public void setIG(String IG) {
        this.IG = IG;
    }

    public String getIDLine() {
        return IDLine;
    }

    public void setIDLine(String IDLine) {
        this.IDLine = IDLine;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    @Override
    public String toString() {
        return "IT18{" + "no=" + no + ", ID=" + ID + ", FirstNameandLastName=" + FirstNameandLastName + ", nickname=" + nickname + ", Facebook=" + Facebook + ", IG=" + IG + ", IDLine=" + IDLine + ", Contact=" + Contact + '}';
    }
}
