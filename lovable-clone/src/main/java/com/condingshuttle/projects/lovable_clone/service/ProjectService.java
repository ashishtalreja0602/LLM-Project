package com.condingshuttle.projects.lovable_clone.service;

import com.condingshuttle.projects.lovable_clone.Dto.project.ProjectRequest;
import com.condingshuttle.projects.lovable_clone.Dto.project.ProjectResponse;
import com.condingshuttle.projects.lovable_clone.Dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
      ProjectResponse getUserProjectById(Long id, Long userId);

     List<ProjectSummaryResponse> getProjects(Long userId);

     ProjectResponse createProject(ProjectRequest request, Long userId);


    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
