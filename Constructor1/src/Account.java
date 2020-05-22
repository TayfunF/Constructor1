
public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public Account() {
        /*this.hesapNo = "Bilgi Yok";
         this.bakiye = 0.0;
         this.isim = "Bilgi Yok";
         this.email = "Bilgi Yok";
         this.telefonNo = "Bilgi Yok";
         */
        this("Bilgi Yok", 0.0, "Bilgi Yok", "Bilgi Yok", "Bilgi Yok");
    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public Account(String isim, String email, String telefonNo) {
        /*this.isim=isim;
         this.email=email;
         this.telefonNo=telefonNo;
         this.bakiye=0.0;
         this.hesapNo="Bilgi Yok";
         */
        this("Bilgi Yok", 0.0, isim, email, telefonNo);
    }

    public void paraYatir(double miktar) {
        this.bakiye = bakiye + miktar;
        System.out.println("Yeni Bakiye : " + bakiye);
    }

    public void goster() {
        System.out.println("Hesap No : " + this.hesapNo);
        System.out.println("Bakiye : " + this.bakiye);
        System.out.println("İsim : " + this.isim);
        System.out.println("Mail : " + this.email);
        System.out.println("Telefon No : " + this.telefonNo);
    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Bir günde 1500 tl den fazla para çekemezsiniz");
        }
        if (bakiye - miktar < 0) {
            System.out.println("Yeterli bakiye yok : " + bakiye);
        } else {
            bakiye = bakiye - miktar;
            System.out.println("Yeni bakiye : " + bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNO() {
        return telefonNo;
    }

    public void setTelefonNO(String telefonNO) {
        this.telefonNo = telefonNO;
    }
}
