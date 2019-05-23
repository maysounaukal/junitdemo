import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountServiceTestNumberTwo {

    public class AccountServiceSecond {//we moeten hier andere naam geven en niet init direct gebruiken
        @Before
        public void init() {
            System.out.println("Shizzle befor");
        }

        @Test
        public void test1() {
            System.out.println("Test 1");
        }

        @Test
        public void test2() {
            System.out.println("Test 2");
        }

        @Test
        public void test3() {
            System.out.println("Test 3");
        }

    }
    //mvn clean test in terminal hebben gedaan om te weten aales is uigevoerd of niet
}