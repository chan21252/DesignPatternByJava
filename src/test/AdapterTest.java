package test;

import adapter.classadpater.Phone;
import adapter.classadpater.Voltage5V;
import adapter.classadpater.VoltageAdapter;
import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void testClassAdapter() {
        Phone phone = new Phone();
        Voltage5V voltageAdapter = new VoltageAdapter();
        Assert.assertTrue(phone.charge(voltageAdapter));
    }

    @Test
    public void testObjectAdapter() {
        Phone phone = new Phone();
        Voltage5V voltageAdapter = new VoltageAdapter();
        Assert.assertTrue(phone.charge(voltageAdapter));
    }
}