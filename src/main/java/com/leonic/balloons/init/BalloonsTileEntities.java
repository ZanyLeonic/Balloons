package com.leonic.balloons.init;

import com.leonic.balloons.tileentities.TileEntityBalloonBlockBlack;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockBlue;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockBrown;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockCyan;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockGreen;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockGrey;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLBlue;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLGrey;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLime;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockMagenta;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockOrange;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockPink;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockPurple;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockRed;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockWhite;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockYellow;

import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 * Registers all the TileEnities in this mod.
 * @author Leonic
 * @version 1.8-0.1
 */
public class BalloonsTileEntities {
	
	/**
	 * Called to register all of the TileEntities. (Called on startup.) 
	 */
	public static void register(){
				GameRegistry.registerTileEntity(TileEntityBalloonBlockBlack.class, "balloon_blacktile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockBlue.class, "ballon_bluetile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockBrown.class, "balloon_browntile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockCyan.class, "balloon_cyantile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockLBlue.class, "balloon_lbluetile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockGreen.class, "balloon_greentile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockGrey.class, "balloon_greytile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockLGrey.class, "balloon_lgreytile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockLime.class, "balloon_limetile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockMagenta.class, "balloon_magenta2tile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockOrange.class, "balloon_orangetile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockPink.class, "balloon_pinktile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockPurple.class, "balloon_purpletile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockRed.class, "balloon_redtile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockWhite.class, "balloon_whitetile");
				GameRegistry.registerTileEntity(TileEntityBalloonBlockYellow.class, "balloon_yellowtile");
	}
}
