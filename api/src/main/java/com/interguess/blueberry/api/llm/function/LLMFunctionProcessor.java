package com.interguess.blueberry.api.llm.function;

import com.interguess.blueberry.api.exception.LLMFunctionExecutionException;
import com.interguess.blueberry.api.llm.response.LLMFunctionCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * Interface for processing function calls from a Large Language Model (LLM).
 */
public interface LLMFunctionProcessor {

    /**
     * Processes a function call from the LLM.
     *
     * @param functionCall the function call to process
     * @return a CompletableFuture that will complete with the result of the function call,
     * @throws LLMFunctionExecutionException if an error occurs during function execution
     */
    @Nullable CompletableFuture<Object> process(@NotNull LLMFunctionCall functionCall) throws LLMFunctionExecutionException;
}
