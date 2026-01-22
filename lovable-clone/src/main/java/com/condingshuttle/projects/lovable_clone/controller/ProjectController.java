package com.condingshuttle.projects.lovable_clone.controller;


import com.condingshuttle.projects.lovable_clone.Dto.project.ProjectRequest;
import com.condingshuttle.projects.lovable_clone.Dto.project.ProjectResponse;
import com.condingshuttle.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.condingshuttle.projects.lovable_clone.entity.Project;
import com.condingshuttle.projects.lovable_clone.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping("")
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProject() {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectsById(@PathVariable Long id) {
        Long userId = 1l;
        return ResponseEntity.ok(projectService.getUserProjectById(id, userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@PathVariable ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProjectResponse> deleteProject(@PathVariable Long id) {
        Long userId = 1L;
        projectService.softDelete(id, userId);
        return ResponseEntity.noContent().build();
    }

}
