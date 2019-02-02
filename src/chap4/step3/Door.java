package chap4.step3;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Door {
	
	private int doorTime=0;
	boolean isOpen=false;
	
	
	protected abstract void open();
	
	public void openTheDoor(){
		open();
		isOpen=true;
		if(enableAutoClose){
			autoClose();
		}
	}
	
	public void closeTheDoor(){
		close();
		isOpen=false;
	}
	protected abstract void close();
	
	public boolean enableAutoClose=false;
	
	public void autoClose(){
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				closeTheDoor();
				timer.cancel();
			}
		}, doorTime);
	}

	public void enableAutoDoorOpen(int time){
		enableAutoClose=true;
		this.doorTime=time;
	}
	
	
}
