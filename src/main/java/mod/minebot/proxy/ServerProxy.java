package mod.minebot.proxy;

import javax.security.auth.login.LoginException;

import mod.minebot.MINEBOT;
import mod.minebot.discord.DISCORDBOT;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.TextureStitchEvent;


public class ServerProxy implements IProxy{
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
	}
	
	@Override
	public void registerEntityRenderer() {
	}

	@Override
	public void registerTileEntitySpecialRenderer() {
	}
	
	@Override
	public void registerSprites(TextureStitchEvent.Pre event) {
	}
	
	@Override
	public void startBot() {
		try {
			MINEBOT.LOG.info("Starting Bot...");
			new DISCORDBOT(null);
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayGui(BlockPos ppos, boolean psecure, boolean psender, String ptext) {
	}
}
