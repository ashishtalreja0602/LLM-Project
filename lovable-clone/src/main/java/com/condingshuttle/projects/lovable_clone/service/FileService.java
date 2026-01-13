package com.condingshuttle.projects.lovable_clone.service;

import com.condingshuttle.projects.lovable_clone.Dto.project.FileContentResponse;
import com.condingshuttle.projects.lovable_clone.Dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getfileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
