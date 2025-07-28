package com.interguess.blueberry.api.stt;

import com.interguess.blueberry.api.exception.STTSetupException;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.io.InputStream;

public abstract class STTProvider {

    @Getter
    @Setter
    private static STTProvider instance;

    /**
     * Checks if the STTProvider instance is initialized.
     *
     * @return true if the STTProvider instance is initialized, false otherwise
     */
    public static boolean isInitialized() {
        return instance != null;
    }

    /**
     * Sets up the Speech-to-Text (STT) provider. This method is called to initialize the STT provider.
     * It should be overridden by subclasses to perform any necessary setup operations.
     *
     * @throws STTSetupException if the setup fails. This exception should be thrown if there are issues
     *                                    during the setup process, such as configuration errors or connection issues.
     */
    public abstract void setup() throws STTSetupException;

    /**
     * Transcribes audio from the provided InputStream.
     *
     * @param audioStream the InputStream containing the
     *                    audio data to be transcribed
     * @return the transcribed text as a String
     */
    public abstract @NotNull String transcribeAudio(@NotNull InputStream audioStream);
}
