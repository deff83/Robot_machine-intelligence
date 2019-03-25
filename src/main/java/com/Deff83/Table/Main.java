/**
 * 
 */
package com.Deff83.Table;

import java.awt.AWTException;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Deff83.Robot.MyRobot;

/**
 * 
 * @author Deff83
 *
 */
public class Main {

	
	public static void main(String[] args) throws IOException, URISyntaxException  {
		// TODO Auto-generated method stub

	    
		ApplicationContext context = new AnnotationConfigApplicationContext("springConfig");
		MyRobot myrobot = context.getBean(MyRobot.class);
		myrobot.move_Mouse(500, 500);
	}

}
