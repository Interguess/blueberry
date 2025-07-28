package com.interguess.blueberry.api;

import com.interguess.blueberry.api.llm.LLMProvider;
import com.interguess.blueberry.api.stt.STTProvider;
import com.interguess.blueberry.api.tts.TTSProvider;
import org.jetbrains.annotations.Nullable;

/**
 * Blueberry API entry point for accessing various providers.
 * This class provides static methods to retrieve instances of LLM, STT, and TTS providers.
 */
public class Blueberry {

    /**
     * Gets the instance of the LLM provider.
     *
     * @return the LLMProvider instance if initialized, otherwise null.
     */
    public static @Nullable LLMProvider getLLMProvider() {
        return LLMProvider.getInstance();
    }

    /**
     * Gets the instance of the STT provider.
     *
     * @return the STTProvider instance if initialized, otherwise null.
     */
    public static @Nullable STTProvider getSTTProvider() {
        return STTProvider.getInstance();
    }

    /**
     * Gets the instance of the TTS provider.
     *
     * @return the TTSProvider instance if initialized, otherwise null.
     */
    public static @Nullable TTSProvider getTTSProvider() {
        return TTSProvider.getInstance();
    }
}
