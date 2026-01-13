package com.condingshuttle.projects.lovable_clone.controller;


import com.condingshuttle.projects.lovable_clone.Dto.member.InviteMemberRequest;
import com.condingshuttle.projects.lovable_clone.Dto.member.MemberResponse;
import com.condingshuttle.projects.lovable_clone.entity.ProjectMember;
import com.condingshuttle.projects.lovable_clone.entity.ProjectMemberId;
import com.condingshuttle.projects.lovable_clone.service.ProjectMemberIdService;
import com.condingshuttle.projects.lovable_clone.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.List;

@RestController
@RequestMapping("/api/projects/projectId")
@RequiredArgsConstructor
public class ProjectMemberController {

    private final ProjectMemberIdService projectMemberService;


    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(@PathVariable Long projectId){
            Long userId = 1L;
            return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId,userId));

    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(@PathVariable Long projectId, @RequestBody InviteMemberRequest request){
            Long userId = 1L;
            return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMember(projectId,request,userId));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody InviteMemberRequest request
    ){
            Long userId = 1L;
            return ResponseEntity.ok(projectMemberService.updatedMemberRole(projectId,memberId,request,userId));
    }


    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteProjectMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody InviteMemberRequest request
    ){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId,memberId,request,userId));
    }
}
