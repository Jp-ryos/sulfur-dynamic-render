package jp.soyr.sulfurcustomblock.datagen;

import jp.soyr.sulfurcustomblock.Registration;
import jp.soyr.sulfurcustomblock.blocks.SulfurOre;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static jp.soyr.sulfurcustomblock.SulfurCustomBlock.MODID;

public class JpryosBlockStates extends BlockStateProvider {

    public JpryosBlockStates(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.SULFUR_ORE.get());
    }

    private void registerSulfur() {
        RegistryObject<SulfurOre> sulfur = Registration.SULFUR_ORE;
        String path = "sulfur";

        BlockModelBuilder base = models().getBuilder("block/" + path + "_main");
        base.parent(models().getExistingFile(mcLoc("cube")));

        base.element()
                .from(0f, 0f, 0f)
                .to(16f, 14f, 16f)
                .allFaces(((direction, faceBuilder) -> faceBuilder.texture("#txt")));

        base.texture("txt", modLoc("block/sulfur_main"));
        base.renderType("solid");

    }

    private void createSulfurOreModel(Block block, String path, BlockModelBuilder frame) {

    }
}
