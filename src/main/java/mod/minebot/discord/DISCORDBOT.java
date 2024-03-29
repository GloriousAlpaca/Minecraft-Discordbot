package mod.minebot.discord;

import javax.security.auth.login.LoginException;

import mod.minebot.MinebotConfig;
import mod.minebot.discord.listener.GuildReadyListener;
import mod.minebot.discord.listener.MessageListener;
import mod.minebot.discord.listener.MessageListenerPrivate;
import mod.minebot.discord.listener.StartListener;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class DISCORDBOT {
	
	public DISCORDBOT(String[] Args) throws LoginException{

		JDABuilder builder = new JDABuilder();

		builder.setToken(MinebotConfig.discord.token);
		builder.setAutoReconnect(true);
		builder.setStatus(OnlineStatus.ONLINE);
		builder.setGame(Game.playing((ReferenceClass.InitialGame)));

        //Listener
        builder.addEventListener(new GuildReadyListener());
        builder.addEventListener(new StartListener());
        builder.addEventListener(new MessageListener());
        builder.addEventListener(new MessageListenerPrivate());

        





		ReferenceClass.main = builder.build();
		









	}

}
