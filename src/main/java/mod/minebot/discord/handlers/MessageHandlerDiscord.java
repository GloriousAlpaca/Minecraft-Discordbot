package mod.minebot.discord.handlers;

import mod.minebot.MinebotConfig;
import mod.minebot.discord.ReferenceClass;
import mod.minebot.discord.SendMessage;
import mod.minebot.discord.persistence.Reader;
import mod.minebot.discord.persistence.Writer;
import mod.minebot.discord.tasks.*;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class MessageHandlerDiscord {

    public static void HandleMessage(MessageReceivedEvent event){
        TextChannel TChannel = event.getTextChannel();
        String message = event.getMessage().getContentRaw();


        if(message.contains("<@")&&message.contains(MinebotConfig.discord.clientid+">")&&message.contains(ReferenceClass.setdefaultchannel)){

            setDefaultChannel.setChannel(event);

        }
        else if(message.contains("<@")&&message.contains(MinebotConfig.discord.clientid+">")&&message.contains(ReferenceClass.getserverstatus)){

            serverStatus.getServerStatus(event);


        }
        else if(message.contains("<@")&&message.contains(MinebotConfig.discord.clientid+">")&&message.contains("help")){
            CommandHelperDiscord.help(event);

        }
        else if(message.contains("<@")&&message.contains(MinebotConfig.discord.clientid+">")&&message.contains(ReferenceClass.getplayerstats)){

            PlayerStatistics.showstatistics(event, ParseCommand.parse(event));

        }






    }
}
