
public class Test {

    public static void main(String[] args) {
        Account account = new Account();
        Account account2 = new Account("0001", 1000.0, "Tayfun", "java123@mail.com", "123456789");
        account2.paraCekme(300);
        account2.paraYatir(300);

        System.out.println(account.getEmail());

        Account account3 = new Account("Ali-Veli", "ornek@gmail.com", "987654321");
        System.out.println(account3.getBakiye());
        System.out.println(account3.getEmail());
       
        account3.goster(); 
        
    }
}