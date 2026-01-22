package com.condingshuttle.projects.lovable_clone.controller;


import com.condingshuttle.projects.lovable_clone.Dto.project.FileContentResponse;
import com.condingshuttle.projects.lovable_clone.Dto.project.FileNode;
import com.condingshuttle.projects.lovable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/projects/{projectId}files")
public class FileControlller {

    private FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTre(@PathVariable Long projectId){
            Long userId  = 1L;
            return ResponseEntity.ok(fileService.getfileTree(projectId,userId));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long projectId,
            @PathVariable String path)
    {
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId,path,userId));
    }



}
