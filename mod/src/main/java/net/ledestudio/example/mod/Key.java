package net.ledestudio.example.mod;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Key {

    @SubscribeEvent
    public static void onClient(RegisterKeyMappingsEvent event) {
        //키 매핑 이벤트 등록
        event.register(KeyMapping.KEY_EXAMPLE.get());
    }
}
