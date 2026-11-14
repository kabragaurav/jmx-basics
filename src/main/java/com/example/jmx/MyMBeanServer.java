package com.example.jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class MyMBeanServer {
    public static void main(String[] args) throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException, MalformedObjectNameException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.example.jmx:type=Person");
        Person person = new Person("Gaurav Kabra");
        mBeanServer.registerMBean(person, objectName);
        Thread.sleep(Long.MAX_VALUE);       // killing/stopping will disconnect from JConsole
    }
}
