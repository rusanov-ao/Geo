package geoTest;

import org.junit.jupiter.api.*;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

import java.util.Objects;

import static ru.netology.geo.GeoServiceImpl.MOSCOW_IP;

public class GeoServiceImplTest {

    GeoServiceImpl sut;




    @BeforeAll
    public static void stertedAll() {
        System.out.println("All tests start");
    }

    @BeforeEach
    public void init() {
        System.out.println("Test start");
        sut = new GeoServiceImpl();
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("All tests completed");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoServiceImplTest)) return false;
        GeoServiceImplTest that = (GeoServiceImplTest) o;
        return sut.equals(that.sut);
    }


    @Test
    public void testByIp() {


        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);
        //String expected2 = "Moscow RUSSIA null 0";
        String a = "172.00.00.0";

        Location result = sut.byIp(a);
        //String result2 = result.getCity() + " " + result.getCountry() + " " + result.getStreet() + " " + result.getBuiling();

        Assertions.assertSame(expected, result);

    }



}

