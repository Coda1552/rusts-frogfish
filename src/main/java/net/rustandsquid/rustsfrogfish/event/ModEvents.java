package net.rustandsquid.rustsfrogfish.event;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rustandsquid.rustsfrogfish.RustsFrogfish;
import net.rustandsquid.rustsfrogfish.entity.ModEntityTypes;
import net.rustandsquid.rustsfrogfish.entity.client.armor.FroghatModel;
import net.rustandsquid.rustsfrogfish.entity.client.armor.FroghatRenderer;
import net.rustandsquid.rustsfrogfish.entity.custom.Froghat;
import net.rustandsquid.rustsfrogfish.entity.custom.NeilpeartiaEntity;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = RustsFrogfish.MOD_ID)
    public class ForgeEvents {



    }
    @Mod.EventBusSubscriber(modid = RustsFrogfish.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class  ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.NEILPEARTIA.get(), NeilpeartiaEntity.setAttributes());
        }

        @SubscribeEvent
        public static void registerArmorRenders(EntityRenderersEvent.AddLayers event) {
            GeoArmorRenderer.registerArmorRenderer(Froghat.class, () -> new FroghatRenderer());
        }
    }
}
