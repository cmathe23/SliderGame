package shiftgame;

import java.awt.Color;

public class Slider {
	private int selectedColor;
	public Box[] array;
	public Barrier[] barrier;
	
	
	public Slider() {
		barrier = new Barrier[3];
		for (int i = 0; i < barrier.length; i++) {
			barrier[i] = new Barrier();
			barrier[i].generate();
			barrier[i].baY = -300 - i*300;
		}
	}

	public Slider(int level) {
		array = new Box[2 * level + 1];
		for (int i = 0; i < array.length; i++) {
			array[i]=new Box(Barrier.types[i]);
		}
	}
	//refreshes fourth barrier
	public void reset(int i) {
		barrier[i].baY = -300;
		barrier[i].generate();
	}

	public void swipeLeft() {
		Color temp = Color.RED;
		for (int i = 0; i < array.length; i++) {
			/*if (i == 0) { THIS CODE WILL STAND AS MONUMENT TO RAHUL'S FAILURE
				temp = Barrier.tempTypes[Barrier.tempTypes.length-1];
				Barrier.tempTypes[Barrier.tempTypes.length - 1] = Barrier.tempTypes[0];
				array[i].setBoColor(Barrier.tempTypes[i]);
			} else if (i == Barrier.tempTypes.length-1){
				array[i].setBoColor(temp);
			} else {
				Barrier.tempTypes[i-1] = Barrier.tempTypes[i];
				array[i].setBoColor(Barrier.tempTypes[i]);
			}
			*/
			if (i==0) {
				temp=Barrier.tempTypes[0];
				Barrier.tempTypes[0]=Barrier.tempTypes[1];
				array[i].setBoColor(Barrier.tempTypes[i]);
			}
			else if (i==Barrier.tempTypes.length-1) {
				Barrier.tempTypes[i]=temp;
				array[i].setBoColor(Barrier.tempTypes[i]);
			} else {
				Barrier.tempTypes[i]=Barrier.tempTypes[i+1];
				array[i].setBoColor(Barrier.tempTypes[i]);
			}
		}
	}
	
public void swipeRight() {
		Color temp=Color.RED;
		for (int i = array.length-1; i >=0; i--) {
			if (i == array.length - 1) {
				temp=Barrier.tempTypes[i];
				Barrier.tempTypes[i]=Barrier.tempTypes[i-1];
				array[i].setBoColor(Barrier.tempTypes[i]);
			} else if (i==0){
				Barrier.tempTypes[i] = temp;
				array[i].setBoColor(Barrier.types[i]);
			} else {
				Barrier.tempTypes[i]=Barrier.tempTypes[i-1];
				array[i].setBoColor(Barrier.types[i]);
			}
		}
	}
}
