package com.leonic.balloons.init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BalloonsCTab extends CreativeTabs {

public BalloonsCTab(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return (Items.apple);
}

}