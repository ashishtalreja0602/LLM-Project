package com.condingshuttle.projects.lovable_clone.entity;

public class UsageLog {


    Long id;
    User user;
    Project project;
    String action;
    Integer tokensUsed;
    Integer durationMs;
    String metaData; // store JSON of the prompt used or the LLM model used

}
