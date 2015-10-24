package com.leonic.balloons.init;

import com.leonic.balloons.helpers.UpdateHelper;

import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
/**
 * UpdateHandler displays Update information in a user friendly way through the chat.
 * @author Leonic
 * @version 0.1
 */

public class UpdateHandler {
    /**
     * Informs the user if an update is available when they log in.
     * @param event The event the code triggers on.
     */
	@SubscribeEvent
    public void PlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event) {
        if(UpdateHelper.show == true)
            event.player.addChatMessage(new ChatComponentText(UpdateHelper.updateStatus));
       //Broken event.player.addChatMessage(new ChatComponentText(UpdateHelper.updateNews));
        	event.player.addChatMessage(new ChatComponentText(UpdateHelper.updateURL));
        	UpdateHelper.show = false;
    }
}