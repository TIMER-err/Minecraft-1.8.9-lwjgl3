package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;

public abstract class MovingSound extends PositionedSound implements ITickableSound {
	protected boolean donePlaying = false;

	protected MovingSound(final ResourceLocation location)
	{ super(location); }

	@Override
	public boolean isDonePlaying() { return this.donePlaying; }
}
