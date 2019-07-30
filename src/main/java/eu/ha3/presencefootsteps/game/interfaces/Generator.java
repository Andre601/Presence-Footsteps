package eu.ha3.presencefootsteps.game.interfaces;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Has the ability to generate footsteps based on a Player.
 * 
 * @author Hurry
 * 
 */
public interface Generator {
	/**
	 * Generate footsteps sounds of the Entity.
	 */
	public void generateFootsteps(EntityPlayer ply);
}
