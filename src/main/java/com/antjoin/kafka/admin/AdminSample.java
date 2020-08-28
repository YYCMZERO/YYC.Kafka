package com.antjoin.kafka.admin;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import java.util.Properties;

/**
 * @author mzero
 */
public class AdminSample {

    public static void main(String[]args){
        AdminClient adminClient = adminclient();
    }

    public static AdminClient adminclient() {
        Properties props = new Properties();
        props.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        AdminClient adminClient = AdminClient.create(props);
        return adminClient;
    }
}
