import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test

    public void hasitDeposit(){
        BankAccount BankAccount = new BankAccount("Zak","Jama", "17072001",123445, 0, 500, "savings",-5000);

        int actual = BankAccount.deposit( 500);
        int result = BankAccount.getBalance();
        assertThat(result).isEqualTo(actual);

    }
    @Test
    public void hasitWithdrawn(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);

        int actual = BankAccount.withdraw(500);
        int result = BankAccount.getBalance();

        assertThat(result).isEqualTo(actual);

    }
    @Test
    public void doesPayInterest(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        assertThat(BankAccount.payInterest(BankAccount.getAccountType())).isEqualTo(1500);
    }

    //Testing Getters and Setters

    @Test
    public void testGetFirstName(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama","17072001", 123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getFirstName()).isEqualTo("Zak");
    }
    @Test
    public void testGetLastName(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama","17072001", 123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getLastName()).isEqualTo("Jama");
    }
    @Test
    public void testGetAccountNumber(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama","17072001", 123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getAccountNumber()).isEqualTo(123345);
    }
    @Test
    public void testGetAccountType(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama","17072001", 123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getAccountType()).isEqualTo("current");
    }
    @Test
    public void testGetOverdraft(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getOverdraft()).isEqualTo(-5000);
    }
    @Test
    public void testGetAmount(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getAmount()).isEqualTo(0);
    }
    @Test
    public void testGetBalance(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getBalance()).isEqualTo(500);

    }
    @Test
    public void testGetDateOfBirth(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        assertThat(BankAccount.getDateOfBirth()).isEqualTo("17072001");

    }
    @Test
    public void testSetDateOfBirth(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setDateOfBirth("05062001");
        assertThat(BankAccount.getDateOfBirth()).isEqualTo("05062001");
    }
@Test
    public void testSetBalance(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setBalance(5);
        assertThat(BankAccount.getBalance()).isEqualTo(5);
    }

    @Test
    public void testSetAmount(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setAmount(5);
        assertThat(BankAccount.getAmount()).isEqualTo(5);
    }

    @Test
    public void testSetOverDraft(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setOverdraft(-10000);
        assertThat(BankAccount.getOverdraft()).isEqualTo(-10000);
    }

    @Test
    public void testSetAccountType(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setAccountType("savings");
        assertThat(BankAccount.getAccountType()).isEqualTo("savings");
    }

    @Test
    public void testSetAccountNumber(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setAccountNumber(123456);
        assertThat(BankAccount.getAccountNumber()).isEqualTo(123456);
    }

    @Test
    public void testSetLastName(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setLastName("Mohamed");
        assertThat(BankAccount.getLastName()).isEqualTo("Mohamed");
    }
    @Test
    public void testSetFirstName(){
        BankAccount BankAccount = new BankAccount("Zak", "Jama", "17072001",123345, 500, 0,"current",-5000);
        BankAccount.setFirstName("Ahmed");
        assertThat(BankAccount.getFirstName()).isEqualTo("Ahmed");
    }










}
