package com.mohit.vidhidarpan;

public class OpenAIRequest {
    private String prompt;
    private int max_tokens;

    public OpenAIRequest(String prompt, int max_tokens) {
        this.prompt = prompt;
        this.max_tokens = max_tokens;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }
    // Getters and setters
}
