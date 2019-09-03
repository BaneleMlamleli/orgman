package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male");
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertEquals("Male", gender.getGenderDescription());
        System.out.println("Gender ID:\t"+ gender.getGenderId() +"\nGender desc.:\t"+ gender.getGenderDescription());
    }
}