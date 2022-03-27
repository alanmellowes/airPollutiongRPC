package server;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

//import ds.examples.maths.MathServer;
//import com.distSCA.service2_prox.MathServiceGrpc.MathServiceImplBase;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import login_service2.MathServiceGrpc.MathServiceImplBase;
import user.UserService;

public class GRPCServer extends MathServiceImplBase {

	// Server set up default message for all connections
	public static void main(String args[]) throws IOException, InterruptedException {
		
		GRPCServer grpcserver = new GRPCServer();

		Properties prop = grpcserver.getProperties();
		
		grpcserver.registerService(prop);
		 
		 System.out.println("starting GRPC Server");
		 Server server = ServerBuilder.forPort(50094).addService(

				 new UserService()).build();
		 
		 server.start(); // kickstart server
		 
		 System.out.println("Server starting at "+ server.getPort()); // 60151 for demo purposes
	        server.awaitTermination();
	 }
	
private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/grpc.properties")) {

	            prop = new Properties();

	            // load the properties file in resources
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("Loading GRPC properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	
	
	private  void registerService(Properties prop) {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//_maths._tcp.local.;
	            String service_name = prop.getProperty("service_name")  ;// "wearables"
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.60151;

	            
	            String service_description_properties = prop.getProperty("service_description")  ;
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}
}