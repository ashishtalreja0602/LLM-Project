package com.condingshuttle.projects.lovable_clone.service;

import com.condingshuttle.projects.lovable_clone.Dto.member.InviteMemberRequest;
import com.condingshuttle.projects.lovable_clone.Dto.member.MemberResponse;
import com.condingshuttle.projects.lovable_clone.Dto.member.UpdateMemberRoleRequest;
import com.condingshuttle.projects.lovable_clone.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberIdService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);
    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updatedMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, InviteMemberRequest request, Long userId);
}
