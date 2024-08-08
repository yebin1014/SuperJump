package net.ledestudio.example.mod;

import com.mojang.blaze3d.platform.InputConstants;
import cpw.mods.util.Lazy;
import org.lwjgl.glfw.GLFW;

public class KeyMapping {

    public static final Lazy<net.minecraft.client.KeyMapping> KEY_EXAMPLE = Lazy.of(() -> new net.minecraft.client.KeyMapping( // 예시 키 매핑 정의
            "key.examplemod.example1", // 매핑 이름
            InputConstants.Type.KEYSYM, // 입력 타입
            GLFW.GLFW_KEY_T, // 키 코드
            "key.categories.misc" // 카테고리
    ));
}
