package com.interguess.blueberry.api.llm.response;

import com.interguess.blueberry.api.llm.LLMResponse;
import org.jetbrains.annotations.NotNull;

/**
 * Interface representing a question posed by a Large Language Model (LLM) to the user.
 * This question should be answered by the user to continue the interaction with the LLM.
 */
public interface LLMQuestion extends LLMResponse {

    /**
     * Gets the text of the question that the LLM is asking the user.
     *
     * @return the question text
     */
    @NotNull String getText();

    /**
     * Answers the question posed by the LLM.
     * This method should be called with the user's answer to the question.
     *
     * @param answer the user's answer to the question
     */
    void answer(@NotNull String answer);
}
