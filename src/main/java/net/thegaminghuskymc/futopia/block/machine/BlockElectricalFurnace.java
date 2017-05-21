package net.thegaminghuskymc.futopia.block.machine;

import keri.ninetaillib.texture.IIconRegistrar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thegaminghuskymc.futopia.block.BlockMachineBase;
import net.thegaminghuskymc.futopia.reference.Refs;
import net.thegaminghuskymc.futopia.tile.tier1.TileAlloyFurnace;

public class BlockElectricalFurnace extends BlockMachineBase {

    @SideOnly(Side.CLIENT)
    private TextureAtlasSprite[] texture;

    public BlockElectricalFurnace() {
        super(Refs.ELECTRICALFURNACE_NAME);
        setRegistryName(Refs.ELECTRICALFURNACE_NAME);
    }

    @Override
    public TileAlloyFurnace createNewTileEntity(World world, int meta) {
        return new TileAlloyFurnace();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegistrar registrar) {
        this.texture = new TextureAtlasSprite[3];
        this.texture[0] = registrar.registerIcon(Refs.MODID + ":blocks/machines/electrical_furnace/electrical_furnace_side");
        this.texture[1] = registrar.registerIcon(Refs.MODID + ":blocks/machines/electrical_furnace/electrical_furnace_front_off");
        this.texture[2] = registrar.registerIcon(Refs.MODID + ":blocks/machines/electrical_furnace/electrical_furnace_front_on");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public TextureAtlasSprite getIcon(int meta, int side) {
        switch (side) {
            case 0:
                return this.texture[0];
            case 1:
                return this.texture[0];
            case 2:
                return this.texture[1];
            case 3:
                return this.texture[0];
            case 4:
                return this.texture[0];
            case 5:
                return this.texture[0];
        }

        return null;
    }

}