package com.interguess.blueberry.api.tts;

import com.interguess.blueberry.api.exception.TTSSetupException;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.util.concurrent.CompletableFuture;

public abstract class TTSProvider {

    @Getter
    @Setter
    private static TTSProvider instance;

    /**
     * Checks if the TTSProvider instance is initialized.
     *
     * @return true if the TTSProvider instance is initialized, false otherwise
     */
    public static boolean isInitialized() {
        return instance != null;
    }

    /**
     * Sets up the Text-to-Speech (TTS) provider. This method is called to initialize the TTS provider.
     * It should be overridden by subclasses to perform any necessary setup operations.
     *
     * @throws TTSSetupException if the setup fails. This exception should be thrown if there are issues
     *                                    during the setup process, such as configuration errors or connection issues.
     */
    public abstract void setup() throws TTSSetupException;

    /**
     * Synthesizes speech from the provided text using the specified voice ID.
     *
     * @param text    the text to be synthesized into speech
     * @param voiceId the ID of the voice to be used for synthesis
     * @return a CompletableFuture that will complete with a InputStream containing the synthesized speech
     */
    public abstract @NotNull CompletableFuture<InputStream> synthesizeSpeech(@NotNull String text, @NotNull String voiceId);
}
