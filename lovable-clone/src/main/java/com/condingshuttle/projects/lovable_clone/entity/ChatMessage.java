package com.condingshuttle.projects.lovable_clone.entity;
import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;
    String content;
    String toolCalls; // JSON Array of tools call
    Integer tokensUsed;
    Instant cratedAt;

}
