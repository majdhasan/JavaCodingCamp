package lesson1;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class App {
    /**
     * @author majdhasan
     * @since today
     *
     */
    public static void main(String[] args) {
        Person majd = new Person("majd","hasan",new Date(),"017632914578");
    }

    @Test
    public void testGetPhoneNumber(){
        Person majd = new Person("majd","hasan",new Date(),"017632914578");
        assertEquals("017632914578", majd.getPhoneNumber());
    }

    @Test
    public void testGetFirstName(){
        Person majd = new Person("majd","hasan",new Date(),"017632914578");
        assertEquals("majd", majd.getFirstName());
    }

}
