package net.thegaminghuskymc.futopia.item;

import keri.ninetaillib.texture.IIconRegistrar;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thegaminghuskymc.futopia.init.FTCreativeTabs;
import net.thegaminghuskymc.futopia.network.EnumMaterialType;
import net.thegaminghuskymc.futopia.reference.Refs;

public class ItemBaseIngot extends ItemFutopia {

    private TextureAtlasSprite[] texture;

    public ItemBaseIngot() {
        super("alloy", EnumMaterialType.toStringArray());
        setCreativeTab(FTCreativeTabs.materials);
    }

    @Override
    public void registerIcons(IIconRegistrar registrar) {
        this.texture = new TextureAtlasSprite[9];

        for (int i = 0; i < EnumMaterialType.values().length; i++) {
            this.texture[i] = registrar.registerIcon(Refs.MODID + ":items/material/alloy_" + EnumMaterialType.values()[i].getName());
        }
    }

    @Override
    public TextureAtlasSprite getIcon(int meta) {
        return this.texture[meta];
    }

}
