import org.junit.Assert;
import org.junit.Test;

public class ReversedStringTest {
    @Test
    public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
        System.out.println("reverseTestWithNull");
    }

    @Test
    public void reverseTestWithDigits(){
        Assert.assertEquals("cbA321",ReverseString.reverseString("123Abc"));
        System.out.println("reverseTestWithDigits");
    }

    @Test
    public void reverseTestHappyPAth(){
        Assert.assertEquals("elppa",ReverseString.reverseString("apple"));
        System.out.println("reverseTestHappyPAth");
        System.out.println("reverseTestHappyPAth added");

    }


}
