package mod.minebot.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {
	public static SimpleNetworkWrapper INSTANCE;
	private static int ID = 0;
	
	private static int nextID() {
		return ID++;
	}
	
	public static void registerMessages(String channelName) {
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
		
		//Registriere Server Packets
		INSTANCE.registerMessage(InterfacetoTileMessage.Handler.class, InterfacetoTileMessage.class, nextID(), Side.SERVER);
		//Registriere Client Packets
		INSTANCE.registerMessage(InterfaceGuiMessage.Handler.class, InterfaceGuiMessage.class, nextID(), Side.CLIENT);
		INSTANCE.registerMessage(ChatMessage.Handler.class, ChatMessage.class, nextID(), Side.CLIENT);
	}
}
