package com.interguess.blueberry.api.llm.response;

import com.interguess.blueberry.api.llm.LLMResponse;
import org.jetbrains.annotations.Nullable;

/**
 * Interface representing a statement response from a Large Language Model (LLM).
 * This interface extends LLMResponse and provides methods to access the text of the statement
 */
public interface LLMStatement extends LLMResponse {

    /**
     * Gets the text of the statement if present.
     *
     * @return the text of the statement, or null if not available
     */
    @Nullable String getText();
}
