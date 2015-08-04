package com.leonic.balloons.init;

import com.leonic.balloons.helpers.UpdateHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

public class UpdateHandler {
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if(UpdateHelper.show == true)
            event.player.addChatMessage(new ChatComponentText(UpdateHelper.updateStatus));
       //Broken event.player.addChatMessage(new ChatComponentText(UpdateHelper.updateNews));
        	event.player.addChatMessage(new ChatComponentText(UpdateHelper.updateURL));
        	UpdateHelper.show = false;
    }
}
