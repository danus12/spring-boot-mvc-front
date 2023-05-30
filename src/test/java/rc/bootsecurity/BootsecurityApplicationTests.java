package rc.bootsecurity;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BootsecurityApplicationTests {
    @Test
    public void checkOnePlusOneEqualsTwo() {
        int somme = 1+1;
        Assertions.assertThat(somme).isNotNull();
        Assertions.assertThat(somme).isEqualTo(2);
    }
    
    @Test
    public void checkOnePlusOneEqualsOne() {
        int somme = 2+1;
        Assertions.assertThat(somme).isNotNull();
        Assertions.assertThat(somme).isEqualTo(3);
    }
}
