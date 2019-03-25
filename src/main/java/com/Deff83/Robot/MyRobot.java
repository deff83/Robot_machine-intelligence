package com.Deff83.Robot;

import java.awt.AWTException;

import java.awt.Robot;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.Deff83.Table.Main;

/**
 * @author Deff83
 *
 */

@Component
public class MyRobot {
	private final Logger logger = LogManager.getLogger(MyRobot.class);
	
	private static Robot control = null;
	
	
	public MyRobot () throws AWTException {
			control = new Robot();
			logger.info("tester");
	}
	public void move_Mouse(int x, int y) {
		control.mouseMove(x, y);
		logger.info("tester");
		
	}
	
}
