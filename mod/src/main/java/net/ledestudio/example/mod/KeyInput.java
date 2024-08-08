package net.ledestudio.example.mod;

import ca.weblite.objc.Message;
import net.minecraft.server.packs.OverlayMetadataSection;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.minecraft.network.chat.Component;

@EventBusSubscriber(modid = ExampleMod.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class KeyInput {

    @SubscribeEvent
    public static void Pressed(ScreenEvent.KeyPressed.Pre event) {
        ExampleMod.getLogger().info(
                "Key: " + event.getKeyCode() + ", Modifier: " +
                        event.getModifiers() + ", ScanCode: " + event.getScanCode()
        );
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onClientTick(ClientTickEvent.Post event) {
        while (KeyMapping.KEY_EXAMPLE.get().consumeClick()) {
            Player player = Minecraft.getInstance().player;
            if (player != null) {
                if (!Wearing(player)) {
                    player.sendSystemMessage(Component.literal("특수 신발을 신으셈"));
                } else {
                    is
                }
            }
            ExampleMod.getLogger().info("특정 키가 눌렸습니다");
        }
    }

    public static boolean Wearing(Player player) {
        Item boots = player.getInventory().getArmor(0).getItem();
        return boots instanceof Shoes;
    }

}
