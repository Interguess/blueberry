package com.interguess.blueberry.api.llm;

import com.interguess.blueberry.api.exception.LLMSetupException;
import com.interguess.blueberry.api.llm.response.LLMResponse;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public abstract class LLMProvider {

    @Getter
    @Setter
    private static LLMProvider instance;

    /**
     * Checks if the LLM provider is initialized.
     *
     * @return true if the LLM provider is initialized, false otherwise.
     */
    public static boolean isInitialized() {
        return instance != null;
    }

    /**
     * Sets up the LLM. This method is called to initialize the LLM provider.
     * It should be overridden by subclasses to perform any necessary setup operations.
     *
     * @throws LLMSetupException if the setup fails. This exception should be thrown if there are issues
     *                           during the setup process, such as configuration errors or connection issues.
     */
    public abstract void setup() throws LLMSetupException;

    /**
     * Generates a response from the LLM based on the provided prompt.
     *
     * @param prompt the prompt to send to the LLM for generating a response.
     * @return a CompletableFuture that will complete with the LLMResponse containing the generated response.
     */
    public abstract @NotNull CompletableFuture<LLMResponse> generateResponse(@NotNull String prompt);
}
