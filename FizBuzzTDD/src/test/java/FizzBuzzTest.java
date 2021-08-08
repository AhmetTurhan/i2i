import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("1",fizzBuzz.convert(1));
        Assert.assertEquals("2",fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzConvertorMultipleOfThree(){
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("Fizz",fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzConvertorMultipleOfFive(){
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("Buzz",fizzBuzz.convert(5));
    }

    @Test
    public void multipleOfBothThreeAndFive(){
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("FizzBuzz",fizzBuzz.convert(15));
    }

}
