package com.Assignment_6;

/*Write MusicalInstrument interface with play method. It also has common 
behavior (static) learnInstrument. Create Abstract class Sound with abstract 
method listenSound.Implement MusicalInstrument interface in 
PercussionInstrument and StringedInstrument classes.Also extend Sound class 
in both classes.Create object ‘Tabla’ of PercussionInstrument class and object 
‘Violin’ of StringedInstrument class.call Paly, learnInstrument and listenSound 
methods of both objects*/

interface MusicalInstrument {
    void play();
    static void learnInstrument() {
        System.out.println("Learn how to play a musical instrument!");
    }
}

abstract class Sound {
    abstract void listenSound();
}

class PercussionInstrument extends Sound implements MusicalInstrument {
    @Override
    void listenSound() {
        System.out.println("Listen to the beat of the percussion instrument.");
    }

    @Override
    public void play() {
        System.out.println("Playing a percussion instrument.");
    }
}

class StringedInstrument extends Sound implements MusicalInstrument {
    @Override
    void listenSound() {
        System.out.println("Listen to the sound of the stringed instrument.");
    }

    @Override
    public void play() {
        System.out.println("Playing a stringed instrument.");
    }
}
public class Q10 {

	public static void main(String[] args) {

	     PercussionInstrument tabla = new PercussionInstrument();
	        tabla.play();
	       // tabla.learnInstrument();//Cannot make a static reference to the non-static method 
	                                //learnInstrument() from the type MusicalInstrument
	        tabla.listenSound();

	        StringedInstrument violin = new StringedInstrument();
	        violin.play();
	        //violin.learnInstrument();
	        violin.listenSound();
	        
	        MusicalInstrument.learnInstrument();
	}

}
