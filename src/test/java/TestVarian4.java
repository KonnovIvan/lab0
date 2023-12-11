import org.example.Variant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
public class TestVarian4 {

    @Test(dataProvider = "integerProvider")
    public void integerTest(int p1, int p2, int p3) { assertEquals(Variant4.task1Int(p1,p2),p3);}

    @DataProvider
    public Object[][] integerProvider(){
        return new Object[][] {{15,3,5}};
    }


    @Test(dataProvider = "booleanProvider")
    public void integerTest(int p1, int p2, boolean p3) { assertEquals(Variant4.task2Bool(p1,p2),p3);}

    @DataProvider
    public Object[][] booleanProvider(){
        return new Object[][] {{3,2,true}};
    }


    @Test(dataProvider = "ifProvider")
    public void integerTest(int p1, int p2, int p3, int p4) { assertEquals(Variant4.task3If(p1,p2,p3),p4);}

    @DataProvider
    public Object[][] ifProvider(){
        return new Object[][] {{2,3,4,3}};
    }



    @Test(dataProvider = "switchProvider")
    public void integerTest(int p1, int p2) { assertEquals(Variant4.task4Case(p1),p2);}

    @DataProvider
    public Object[][] switchProvider(){
        return new Object[][] {{7,31}};
    }



    @Test(dataProvider = "forProvider")
    public void integerTest(double p1, double[] p2) { assertEquals(Variant4.task5For(p1),p2);}

    @DataProvider
    public Object[][] forProvider(){
        return new Object[][] {{5.5, new double[]{5.5, 11.0, 16.5, 22.0, 27.5, 33.0, 38.5, 44.0, 49.5, 55.0}}};
    }



    @Test(dataProvider = "whileProvider")
    public void integerTest(int p1, boolean p2) { assertEquals(Variant4.task6While(p1),p2);}

    @DataProvider
    public Object[][] whileProvider(){
        return new Object[][] {{27,true}};
    }




}
