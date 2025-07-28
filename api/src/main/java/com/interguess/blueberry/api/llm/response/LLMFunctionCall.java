package com.interguess.blueberry.api.llm.response;

import com.interguess.blueberry.api.llm.LLMResponse;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Interface representing a function call response from a Large Language Model (LLM).
 * This interface extends LLMResponse and provides methods to access the function name
 * and the arguments to be passed to the function.
 */
public interface LLMFunctionCall extends LLMResponse {

    /**
     * Gets the name of the function to be called.
     *
     * @return the name of the function
     */
    @NotNull String getName();

    /**
     * Gets the arguments to be passed to the function.
     * The arguments are represented as a map where the keys are argument names
     * and the values are the corresponding argument values.
     *
     * @return a map of argument names to their values
     */
    @NotNull Map<String, Object> getArguments();

    /**
     * Sets the response for the function call.
     *
     * @param response the response object to be set for the function call.
     */
    void response(@NotNull Object response);
}
