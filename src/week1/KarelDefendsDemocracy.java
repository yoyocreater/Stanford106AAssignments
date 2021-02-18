package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
			move();
		if (beepersPresent()) {
			move();
			} else {
			turnLeft();
			
		}
				move();
				if (noBeepersPresent()) {
					turnLeft();
					move();
				}
					if (beepersPresent()) {
						pickBeeper();
					} else {
						turnAround();
				}
					
					for (int i=0; i<2; i++) {
						move();
					}
						turnAround();
						move();
						turnRight();
						for (int i=0; i<2; i++) {
							move();
						}
							if (noBeepersPresent()) {
								turnLeft();
								move();
								if (beepersPresent())
								pickBeeper();
							}
							    turnAround();
							    for (int i=0; i<2; i++) {
							    	move();
							    }
								turnAround();
								move();
						
								turnRight();
									for (int i=0; i<4; i++) {
											move();
									}
				
								if (noBeepersPresent()) {
									turnLeft(); 
									move();
									if (beepersPresent())
										pickBeeper();
									
								}
					
								turnAround();
								for (int i=0; i<2; i++) {
									move();
								}
								if (beepersPresent()) {
									pickBeeper();
									pickBeeper();
									
									}
						
								        turnAround();
										move();
	
										turnRight();
										move();
	   }
	}
		
		
			
		 

				
			
				

	
	
	
		

