package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.StrucutreSpawnEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Predicate;


@Mixin(ChunkGenerator.class)
public class ChunkGeneratorMixin {

    @Final
    @Shadow
    protected BiomeSource biomeSource;

//    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;tryGenerateStructure(Lnet/minecraft/world/level/levelgen/structure/StructureSet$StructureSelectionEntry;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;JLnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/SectionPos;)Z",
//            at = @At(value = "INVOKE",
//                    target = "Lnet/minecraft/world/level/StructureManager;setStartForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;Lnet/minecraft/world/level/chunk/StructureAccess;)V"))
//    private void sixik$createStructures(StructureSet.StructureSelectionEntry structureSelectionEntry, StructureManager structureManager, RegistryAccess registryAccess, RandomState randomState, StructureTemplateManager templateManager, long l, ChunkAccess chunkAccess, ChunkPos chunkPos, SectionPos sectionPos, CallbackInfoReturnable<Boolean> cir){
//        try {
//            MinecraftForge.EVENT_BUS.post(new StrucutreSpawnEvent(chunkAccess.getWorldForge(), structureSelectionEntry, structureManager, registryAccess, randomState, templateManager, l, chunkAccess, chunkPos, sectionPos));
//        } catch (NullPointerException ec){}
//    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    private boolean tryGenerateStructure(StructureSet.StructureSelectionEntry structureSelectionEntry, StructureManager structureManager, RegistryAccess registryAccess, RandomState randomState, StructureTemplateManager templateManager, long lon, ChunkAccess chunkAccess, ChunkPos chunkPos, SectionPos sectionPos){
        boolean preCancelEvent = false;
        if(preCancelEvent) return false;
        Structure structure = structureSelectionEntry.structure().value();
        int i = fetchReferences(structureManager, chunkAccess, sectionPos, structure);
        HolderSet<Biome> holderset = structure.biomes();
        Predicate<Holder<Biome>> predicate = holderset::contains;
        StructureStart structurestart = structure.generate(registryAccess, (ChunkGenerator) (Object)this, this.biomeSource, randomState, templateManager, lon, chunkPos, i, chunkAccess, predicate);
        if (structurestart.isValid()) {
            StrucutreSpawnEvent event = new StrucutreSpawnEvent(chunkAccess.getWorldForge(), structureSelectionEntry, structureManager, registryAccess, randomState, templateManager, lon, chunkAccess, chunkPos, sectionPos);
            event.setCanceled(preCancelEvent);
            MinecraftForge.EVENT_BUS.post(event);
            if(event.isCanceled()) return false;
            structureManager.setStartForStructure(sectionPos, structure, structurestart, chunkAccess);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    private static int fetchReferences(StructureManager p_223055_, ChunkAccess p_223056_, SectionPos p_223057_, Structure p_223058_) {
        StructureStart structurestart = p_223055_.getStartForStructure(p_223057_, p_223058_, p_223056_);
        return structurestart != null ? structurestart.getReferences() : 0;
    }

//    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;createReferences(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V",
//    at = @At(value = "INVOKE",
//    target = "Lnet/minecraft/world/level/StructureManager;addReferenceForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;JLnet/minecraft/world/level/chunk/StructureAccess;)V"))
//    private void sixik$createReferences(WorldGenLevel p_223077_, StructureManager p_223078_, ChunkAccess p_223079_, CallbackInfo ci){
//        SixikInvasion.LOGGER.debug("Mixin F Work");
//        SixikInvasion.LOGGER.debug(String.valueOf(p_223079_.getPos().getWorldPosition()));
//        SixikInvasion.LOGGER.debug(String.valueOf(p_223079_.getPos().g));
//    }
}
