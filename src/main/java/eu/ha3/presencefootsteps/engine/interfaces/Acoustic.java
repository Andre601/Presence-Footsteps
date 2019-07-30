package eu.ha3.presencefootsteps.engine.interfaces;

/**
 * Something that has the ability to play sounds.
 * 
 * @author Hurry
 */
public interface Acoustic {
	/**
	 * Plays a sound.
	 * 
	 * @param player
	 * @param location
	 * @param event
	 * @param inputOptions
	 */
	public void playSound(SoundPlayer player, Object location, EventType event, Options inputOptions);
	
}