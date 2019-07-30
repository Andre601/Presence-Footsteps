package eu.ha3.presencefootsteps.engine.implem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import eu.ha3.presencefootsteps.engine.interfaces.Acoustic;
import eu.ha3.presencefootsteps.engine.interfaces.EventType;
import eu.ha3.presencefootsteps.engine.interfaces.Options;
import eu.ha3.presencefootsteps.engine.interfaces.SoundPlayer;

public class SimultaneousAcoustic implements Acoustic {
	protected List<Acoustic> acoustics;
	
	public SimultaneousAcoustic(Collection<Acoustic> acoustics) {
		this.acoustics = new ArrayList<Acoustic>(acoustics);
	}
	
	@Override
	public void playSound(SoundPlayer player, Object location, EventType event, Options inputOptions) {
		for (Acoustic acoustic : acoustics) {
			acoustic.playSound(player, location, event, inputOptions);
		}
	}
}
